/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.other;

/**  

* <p>Title: ThreadLocal_Test</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019年3月3日  

*/
public class ThreadLocal_Test {
	public static void main(String[] args) {
		ThreadLocal_Bank bank = new ThreadLocal_Bank();
		ThreadLocal_Interest interest = new ThreadLocal_Interest(bank);
		
		Thread t1 = new Thread(interest);
		t1.start();
		
		Thread t2 = new Thread(interest);
		t2.start();
		
		System.out.println("main线程的bank值为 ： " + bank.get());
	}
}
