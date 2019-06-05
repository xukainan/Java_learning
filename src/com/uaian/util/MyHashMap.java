/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.util;

/**  
* <p>Title: MyHashMap</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019年6月5日  
*/
public class MyHashMap<K,V> {
	//数组
	public Entry<K,V>[] entryArr = new Entry[8];
	//size
	public int size = 0;
	public int size() {
		return size;
	}
	//put
	public void put(K k,V v) {
		//hash + index
		long hash = k.hashCode();
		int index = (int)hash % entryArr.length;
		for (Entry<K,V> entry = entryArr[index]; entry != null;
				entry = entry.nextEntry) {
			if(k.equals(entry.k)) {
				entry.v = v;
			}
		}
		entryArr[index] = new Entry(k, v, entryArr[index]);
		size++;
	}
	//get
	public V get(K k) {
		//hash + index
		long hash = k.hashCode();
		int index = (int)hash % entryArr.length;
		
		for (Entry<K,V> entry = entryArr[index];
				entry != null;
				entry = entry.nextEntry) {
			if (k.equals(entry.k)) {
				return entry.v;
			}
		}
		return null;
	}
}
/**
 * 链表当前节点
* <p>Title: Entry</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019年6月5日
 */
class Entry<K,V> {
	public K k;
	public V v;
	public Entry<K,V> nextEntry;

	public Entry(K k, V v, Entry<K, V> nextEntry) {
		super();
		this.k = k;
		this.v = v;
		this.nextEntry = nextEntry;
	}
	
	
}
