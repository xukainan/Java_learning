/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.thread;

/**  
* <p>Title: Runnable_Test</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019��3��31��  
*/
public class Runnable_Test{
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {			
			@Override
			public void run() {
				System.out.println("����runnableʵ�ֵķ�����");
			}
		};
//		Runnable runnable = ()->{
//			System.out.println("����runnableʵ�ֵķ�����");
//		};
		new Thread(runnable).start();
		
	}


}
