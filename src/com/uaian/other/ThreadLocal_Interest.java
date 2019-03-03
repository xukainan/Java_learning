/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.other;

/**  

* <p>Title: ThreadLocal_Interest</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019Äê3ÔÂ3ÈÕ  

*/
public class ThreadLocal_Interest implements Runnable{
	
	ThreadLocal_Bank bank;
	
	public ThreadLocal_Interest(ThreadLocal_Bank bank) {
		this.bank = bank;
	}

	/* (non-Javadoc)  
	
	 * <p>Title: run</p>  
	
	 * <p>Description: </p>  
	  
	
	 * @see java.lang.Runnable#run()  
	
	 */
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			bank.set();
			System.out.println(Thread.currentThread() + "    " +  bank.get());
		}
	}

}
