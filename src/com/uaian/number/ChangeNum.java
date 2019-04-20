/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.number;

/**  
* <p>Title: ChangeNum</p>  
* <p>Description: 异或实现两数交换</p>  
* @author kainan  
* @date 2019年4月13日  
*/
public class ChangeNum {
	public static void main(String[] args) {
		int a = 1,b = 2;
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println("a= " + a + ", b=" + b);
	}
}
