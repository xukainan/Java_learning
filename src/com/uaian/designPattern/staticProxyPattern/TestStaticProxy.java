/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.staticProxyPattern;

/**  
* <p>Title: testStaticProxy</p>  
* <p>Description: ��̬����</p>  
* @author kainan  
* @date 2019��4��22��  
*/
public class TestStaticProxy {

	public static void main(String[] args) {
		Jay jay = new Jay();
		new AgentPersion(jay).show();
	}
}
