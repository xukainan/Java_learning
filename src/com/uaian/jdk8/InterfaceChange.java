/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.jdk8;


/**  
* <p>Title: InterfaceChange</p>  
* <p>Description: jdk1.8�ӿڶ����ǿ</p>  
* @author kainan  
* @date 2019��4��15��  
*/
public interface InterfaceChange {
	//private int  a = 1;����
	//private default void name() {} ����
	 int a  = 1;
	 public int a2  = 1;
	 public static final int a3 = 1;
	 //protect int a4 = 1; ����
	 public default void name() {
		 System.out.println("���ǽӿ���ͨ����");
	 }
	 public static void name2() {
		 System.out.println("���ǽӿھ�̬����");
	 }
	 //static {}����
}
