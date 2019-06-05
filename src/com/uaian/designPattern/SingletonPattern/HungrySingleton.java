/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.SingletonPattern;

/**  
* <p>Title: HungrySingleton</p>  
* <p>Description: ����ʽ</p>  
* @author kainan  
* @date 2019��4��24��  
*/
public class HungrySingleton {
	//����ʵ��
	private static final HungrySingleton hungrySingleton = new HungrySingleton();
	//˽�л����캯��
	private HungrySingleton() {}
	//��������
	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}
}
