/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.other;

/**  
* <p>Title: CustomExceptionTest</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019Äê5ÔÂ5ÈÕ  
*/
class CustomException extends RuntimeException{
	public CustomException(String msg) {
		super(msg);
	}
}
public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			int i = 1/0;
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
}
