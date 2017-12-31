package proxy;

//静态代理
public class HelloProxy implements Hello {
	Hello hello;
	
	public HelloProxy(){
		hello=new HelloImpl();
	}
	@Override
	public void say(String name) {
		before();
		hello.say(name);
		after();
	}

	private void before() {
		System.out.println("before");
	}
	
	private void after() {
		System.out.println("after");
	}
}
