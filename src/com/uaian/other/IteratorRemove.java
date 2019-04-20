/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/**  
* <p>Title: IteratorRemove</p>  
* <p>Description: ʹ�õ�����ɾ������Ԫ��</p>  
* @author kainan  
* @date 2019��4��14��  
*/
public class IteratorRemove {
	public static void main(String[] args) {
		List<String> strList = new LinkedList<String>();
		for (int i = 0; i < 10000; i++) {			
			strList.add(String.valueOf(i));
		}
		String tempString = "";
		String patternString = "^[1-9]*$";
	    Iterator<String> iterator = strList.iterator();
	    while (iterator.hasNext()) {
	    	tempString = iterator.next();
			if(Pattern.matches(patternString,tempString)) {
				iterator.remove(); //ע��Ҫ�õ�������remove�������ü��ϵ�remove
			}
		}
	    for (int i = 0; i < strList.size(); i++) {
		    System.out.println(strList.get(i));
		}
	    
	}
}
