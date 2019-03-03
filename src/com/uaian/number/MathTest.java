/**  

* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/
package com.uaian.number;

/**  

* <p>Title: MathTest</p>  

* <p>Description: ����ʹ��Math��</p>  

* @author kainan  

* @date 2019��3��2��  

*/
public class MathTest {
	public static void main(String[] args) {
		IMath iMath = (double num, int scale) ->  Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
		double reNum = iMath.getNumRound(17.6892, 2);
		System.out.println(reNum);
	}
}
