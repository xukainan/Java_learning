/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.sortAlgorithm;

import java.util.Arrays;

/**  
* <p>Title: InsertionSort</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019年4月1日  
*/
public class InsertionSort {
	public static void main(String[] args) {
		int[] unsortArr = new int[] {8,15,2,19,17,16,3};
		for (int i = 1; i < unsortArr.length; i++) { //待排序数组
			for (int j = 0; j < i; j++) { //已排序数组
				if(unsortArr[j] > unsortArr[i]) {
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
