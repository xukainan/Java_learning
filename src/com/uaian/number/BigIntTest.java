/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.number;

import java.math.BigInteger;

/**  

* <p>Title: BigIntTest</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019��3��3��  

*/
public class BigIntTest {
	public static void main(String[] args) {
		BigInteger bigInteger = new BigInteger("45615146541561");
		BigInteger bigInteger2 = new BigInteger("6541315");
		BigInteger[] resBigIntegers = bigInteger.divideAndRemainder(bigInteger2);
		System.out.println("����������������Ϊ��" + resBigIntegers[0]  +
					",����Ϊ��" + resBigIntegers[1]);
	}
}
