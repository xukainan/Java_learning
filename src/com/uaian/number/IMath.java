/**  

* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/
package com.uaian.number;

/**  

* <p>Title: IMath</p>  

* <p>Description: Math接口</p>  

* @author kainan  

* @date 2019年3月2日  

*/
@FunctionalInterface
public interface IMath {
	double getNumRound(double num, int scale);
}
