/**  

* <p>Copyright: Copyright (c) 2019</p>  

* <p>Company: https://github.com/xukainan/java_learning</p>  

*/
package com.uaian.number;

import java.util.Random;

/**  

* <p>Title: RandowTest</p>  

* <p>Description: Random类测试</p>  

* @author kainan  

* @date 2019年3月2日  

*/
public class RandomTest {
	Random random = new Random();
	int[] lotteryArr = new int[7];
	public static void main(String[] args) {
		RandomTest randomTest = new RandomTest();
		int[] Lottery = randomTest.getLotteryArr();
		for (int i = 0; i < 7; i++) {
			System.out.print(Lottery[i] + "    ");
		}
	}
	
	private int[]  getLotteryArr() {
		int i = 0;
		while (i < 6) {
			int tempNum = random.nextInt(33);
			if (tempNum == 0 || !isRedNumTrue(tempNum)) {
				continue;
			}
			lotteryArr[i] = tempNum;
			i++;
		}
		int j = 0;
		while (j < 1) {
			int tempNum = random.nextInt(16);
			if (tempNum == 0 || !isRedNumTrue(tempNum)) {
				continue;
			}
			lotteryArr[6] = tempNum;
			j++;
		}
		return lotteryArr;
	}
	
	private boolean isRedNumTrue(int tempNum) {
		for (int i = 0; i < lotteryArr.length; i++) {
			if(lotteryArr[i] == tempNum) {
				return false;
			}
		}
		return true;
	}
}
