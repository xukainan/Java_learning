/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.other;

/**  
* <p>Title: TransCharTest</p>  
* <p>Description: ת���ַ���ʹ��</p>  
* @author kainan  
* @date 2019��4��13��  
*/
public class TransCharTest {
	public static void main(String[] args) {
		String testString = "123|456|567|789";
		//����д��
		//String[] reStrings = testString.split("|");
		String[] reStrings = testString.split("\\|");
		for (int i = 0; i < reStrings.length; i++) {
			System.out.println(reStrings[i]);
		}
	}
}
