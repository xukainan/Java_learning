/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.jdk8;


/**  
* <p>Title: InterfaceChange</p>  
* <p>Description: jdk1.8接口定义加强</p>  
* @author kainan  
* @date 2019年4月15日  
*/
public interface InterfaceChange {
	//private int  a = 1;报错
	//private default void name() {} 报错
	 int a  = 1;
	 public int a2  = 1;
	 public static final int a3 = 1;
	 //protect int a4 = 1; 报错
	 public default void name() {
		 System.out.println("这是接口普通方法");
	 }
	 public static void name2() {
		 System.out.println("这是接口静态方法");
	 }
	 //static {}报错
}
