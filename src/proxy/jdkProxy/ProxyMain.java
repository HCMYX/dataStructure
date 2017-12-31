package proxy.jdkProxy;

import proxy.Hello;
import proxy.HelloProxy;

/**
 * 静态代理
 * @author mwb
 *
 */
public class ProxyMain {
	public static void main(String[] args) {
		Hello helloProxy=new HelloProxy();
		helloProxy.say("张三");
	}
}
