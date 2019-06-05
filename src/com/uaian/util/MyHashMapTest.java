/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.util;

/**  
* <p>Title: MyHashMapTest</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019Äê6ÔÂ5ÈÕ  
*/
public class MyHashMapTest {
	public static void main(String[] args) {
		MyHashMap<String, String> myHashMap = new MyHashMap<>();
		myHashMap.put("1", "test1");		
		System.out.println(myHashMap.get("1"));
		
		for (int i = 0; i < 20; i++) {
			myHashMap.put("k" + i, "v" + i);
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(myHashMap.get("k" + i));
		}
	}
}
