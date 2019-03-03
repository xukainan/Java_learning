/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.other;

import java.util.Optional;

/**  

* <p>Title: OptionalTest</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019Äê3ÔÂ3ÈÕ  

*/
public class OptionalTest {
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.of(123);
		Optional<Integer> optional1 = Optional.ofNullable(null);
		Integer integer = optional1.orElse(new Integer(1));
		Integer integer2 = optional.orElse(new Integer(1));
		System.out.println(integer + integer2);
	}
}
