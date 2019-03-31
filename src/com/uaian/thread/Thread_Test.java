/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.thread;

/**  
* <p>Title: Thread_Test</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019年3月31日  
*/
public class Thread_Test extends Thread{
	public static void main(String[] args) {
		
		Thread thread = new Thread() {
			/* (non-Javadoc)  
			 * <p>Title: run</p>  
			 * <p>Description: </p>    
			 * @see java.lang.Thread#run()  
			 */
			@Override
			public void run() {
				System.out.println("这是Thread方法实现的线程！");
			}
		};
		thread.start();
		

	}
	

}
