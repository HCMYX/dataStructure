package proxy.cgLibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLibProxy implements MethodInterceptor{
	private Object obj;
	private static CGLibProxy instance=new CGLibProxy();
	
	private CGLibProxy(){
		
	}
	
	public static CGLibProxy getinstance(){
		return instance;
	}
	
	@SuppressWarnings("unchecked")
	public Object getProxy(Object target){
		this.obj=target;
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(this.obj.getClass());//设置代理目标
		enhancer.setCallback(this);// 设置回调  
		enhancer.setClassLoader(target.getClass().getClassLoader());
		return enhancer.create();
	}
	
//	public <T> T getProxy(Class<T> cls){
//		return (T)Enhancer.create(cls,this);
//	}
//	
	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		before();
		Object result=proxy.invokeSuper(obj, args);
		after();
		return result;
	}
	

	
	private void before() {
		System.out.println("before");
	}
	private void after() {
		System.out.println("after");
	}
	
}
