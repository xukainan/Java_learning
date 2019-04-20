/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.other;

/**  
* <p>Title: StaticFunTest</p>  
* <p>Description: 测试静态方法</p>  
* @author kainan  
* @date 2019年4月19日  
*/
public class StaticFunTest {
	private int i = 1;
	public static void main(String[] args) {
		StaticFunTest.outNum();
	}
	public static void outNum() {
		//静态方法不能使用非静态成员变量。除非先实例化对象
		//因为静态方法在类被加载的时候已经被初始化，这时候还没有初始化非静态成员变量
		StaticFunTest staticFunTest = new StaticFunTest();
		System.out.println(staticFunTest.i);
	}
}
