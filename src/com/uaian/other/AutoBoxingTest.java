/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.other;

/**  
* <p>Title: AutoBoxingTest</p>  
* <p>Description: 自动装箱、拆箱原理</p>  
* @author kainan  
* @date 2019年4月16日  
*/
public class AutoBoxingTest {
	public static void main(String[] args) {
		Integer i0 = 0;
		Integer i1 = 1;
		Integer i2 = 1;
		Integer i3 = new Integer(1);
		Integer i4 = new Integer(1);
		Integer i5 = new Integer(0);
		Float f1 = 1f;
		Float f2 = 1f;
		
		//1、int值只要在-128和127之间的自动装箱对象都从缓存中获取的，所以为true
		System.out.println(i1 == i2);
		//2、涉及到数字的计算，就必须先拆箱成int再做加法运算，所以不管他们的值是否在-128和127之间，只要数字一样就为true
		System.out.println(i1 == i2 + i0);
		//3.比较的是对象内存地址，所以为false
		System.out.println(i4 == i3);
		//4、同第2条解释，拆箱做加法运算，对比的是数字，所以为true
		System.out.println(i4 == i5 + i3);
		//5.浮点型的装箱操作没有使用缓存，每次都是new，所以false
		System.out.println(f1 == f2);
	}
}
