/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.dynamicProxy;

import java.lang.reflect.Proxy;

/**  
* <p>Title: testStaticProxy</p>  
* <p>Description: 动态代理</p>  
* @author kainan  
* @date 2019年4月22日  
*/
public class TestDynamicProxy {

	public static void main(String[] args) {
		Persion persion = new Jay();
		Persion agentPersion = (Persion)Proxy.newProxyInstance(
					TestDynamicProxy.class.getClassLoader(), persion.getClass().getInterfaces(),
					new DynamicProxy(persion));
		agentPersion.show();
	}
}
