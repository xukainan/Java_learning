/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.methodreferences;

/**  

* <p>Title: IMethodRef</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019Äê3ÔÂ3ÈÕ  

*/
@FunctionalInterface
public interface IMethodRef<P, R> {
	R strValueOf(P p);
}
