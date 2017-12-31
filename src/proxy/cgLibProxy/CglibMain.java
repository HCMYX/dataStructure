package proxy.cgLibProxy;

import proxy.HelloImpl;

public class CglibMain {
	public static void main(String[] args) {
		HelloImpl helloImpl=new HelloImpl();
		HelloImpl helloProxy=(HelloImpl)CGLibProxy.getinstance().getProxy(helloImpl);
		helloProxy.say("123");
	}
}
