/**  


* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/  
package com.uaian.other;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**  

* <p>Title: TimerTest</p>  

* <p>Description: </p>  

* @author kainan  

* @date 2019Äê3ÔÂ3ÈÕ  

*/
public class TimerTest {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(System.currentTimeMillis());
			}
		}, new Date(), 1000);
	}
}
