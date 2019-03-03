/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.other;

/**  

* <p>Title: ThreadLocal_Bank</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019Äê3ÔÂ3ÈÕ  

*/
public class ThreadLocal_Bank {
	ThreadLocal<Integer> t= new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return 10000;
		};
	};
	public int get() {
		return t.get();
	}
	public void set() {
		t.set(t.get() + 10);
	}
}
