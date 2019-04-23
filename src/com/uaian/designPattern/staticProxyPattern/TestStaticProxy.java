/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.staticProxyPattern;

/**  
* <p>Title: testStaticProxy</p>  
* <p>Description: 静态代理</p>  
* @author kainan  
* @date 2019年4月22日  
*/
public class TestStaticProxy {

	public static void main(String[] args) {
		Jay jay = new Jay();
		new AgentPersion(jay).show();
	}
}
