/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**  
* <p>Title: Callable_Test</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019年3月31日  
*/
public class Callable_Test {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> callable = ()->{
				return "这是callable实现的线程！";

		};
		FutureTask<String> futureTask = new FutureTask<>(callable);
		new Thread(futureTask).start();
		System.out.println(futureTask.get());
	}
	
}
