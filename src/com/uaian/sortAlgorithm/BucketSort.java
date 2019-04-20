/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.sortAlgorithm;

/**  
* <p>Title: BucketSort</p>  
* <p>Description: 桶排序算法</p>  
* @author kainan  
* @date 2019年4月1日  
*/
public class BucketSort {
	public static void main(String[] args) {
		int[] unsortArr = new int[] {8,15,2,19,17};
		int[] sortArr = new int[20];
		for (int i : unsortArr) {
			sortArr[i] = i;
		}
		for (int i : sortArr) {
			if(sortArr[i] != 0) {
				System.out.println(sortArr[i]);
			}
		}
	}
}
