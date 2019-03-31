/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**  
* <p>Title: Executor_Test</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019年3月31日  
*/
public class Executor_Test {
	public static void main(String[] args) {
		ExecutorService excutors =  Executors.newFixedThreadPool(1);
		Runnable runnable = ()-> System.out.println("这是Executor实现的线程池 ！");
		excutors.execute(runnable);
	}
}
