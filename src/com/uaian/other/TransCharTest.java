/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.other;

/**  
* <p>Title: TransCharTest</p>  
* <p>Description: 转义字符的使用</p>  
* @author kainan  
* @date 2019年4月13日  
*/
public class TransCharTest {
	public static void main(String[] args) {
		String testString = "123|456|567|789";
		//错误写法
		//String[] reStrings = testString.split("|");
		String[] reStrings = testString.split("\\|");
		for (int i = 0; i < reStrings.length; i++) {
			System.out.println(reStrings[i]);
		}
	}
}
