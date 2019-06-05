/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.SingletonPattern;

/**  
* <p>Title: LazySingleton</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019��4��24��  
*/
public class LazySingleton {
	
	private static LazySingleton lazySingleton;
	
	static {
		lazySingleton = new LazySingleton();
	}
	
	private LazySingleton() {}
	
	//��������
	public static LazySingleton getInstance() {
		return lazySingleton;
	}
}
