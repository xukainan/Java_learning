/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.SingletonPattern;

/**  
* <p>Title: HungrySingleton</p>  
* <p>Description: 饿汉式</p>  
* @author kainan  
* @date 2019年4月24日  
*/
public class HungrySingleton {
	//构造实例
	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	//私有化构造函数
	private HungrySingleton() {}
	//方法返回
	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}
}
