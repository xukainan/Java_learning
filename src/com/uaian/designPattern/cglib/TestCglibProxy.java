/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.cglib;

import java.lang.reflect.Proxy;

/**  
* <p>Title: testStaticProxy</p>  
* <p>Description: ��̬����</p>  
* @author kainan  
* @date 2019��4��22��  
*/
public class TestCglibProxy {

	public static void main(String[] args) {
		Persion persion = new Jay();
		CglibProxy cglibProxy = new CglibProxy();
		Jay jay = (Jay)cglibProxy.getInstance(persion);
		jay.show();
	}
}
