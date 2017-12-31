package proxy.jdkProxy;

import java.lang.reflect.Proxy;

import proxy.Hello;
import proxy.HelloImpl;

/**
 * 动态代理
 * @author mwb
 *
 */
public class DynamicMain {
	
	public static void main(String[] args) {
		Hello hello=new HelloImpl();
		
		DynamicProxy dynamicProxy=new DynamicProxy(hello);
		
		/*Hello helloProxy=(Hello)Proxy.newProxyInstance(
				hello.getClass().getClassLoader(), 
				hello.getClass().getInterfaces(), 
				dynamicProxy);*/
		Hello helloProxy=dynamicProxy.getProxy();
		helloProxy.say("你好"); 
	}
}
