/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.methodreferences;

import java.sql.Date;

/**  

* <p>Title: IMethodRef4</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019��3��3��  

*/
@FunctionalInterface
public interface IMethodRef4<P, R> {
	R getCurDate(P p);
}
