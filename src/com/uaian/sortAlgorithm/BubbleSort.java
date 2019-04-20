/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.sortAlgorithm;

/**  
* <p>Title: BubbleSort</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019Äê4ÔÂ1ÈÕ  
*/
public class BubbleSort {
	public static void main(String[] args) {
		int[] unsortArr = new int[] {8,15,2,19,17,16,3};
		for (int i = 0; i < unsortArr.length-1; i++) {
			for (int j = i+1; j < unsortArr.length; j++) {
				if(unsortArr[i] > unsortArr[j]) {
					unsortArr[i] ^= unsortArr[j];
					unsortArr[j] ^= unsortArr[i];
					unsortArr[i] ^= unsortArr[j];
				}
			}
		}
		for (int i = 0; i < unsortArr.length; i++) {
			System.out.println(unsortArr[i]);
		}
	}
}
