/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.String;

/**  
* <p>Title: StringPoolTest</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019年4月24日  
*/
public class StringPoolTest {
	 public static void main(String[] args) {
		String s1 = new StringBuilder("ja").append("va").toString();
		System.out.println(s1 == s1.intern());
		//java是关键字，在string pool中肯定是会有的
		
		String s2 = new StringBuilder("xu").append("kainan").toString();
		System.out.println(s2 == s2.intern());
		//xukainan 在池中没有，但是在heap中存在，则intern时，会直接返回该heap中的引用
		
        String s3=new String("test");  //false
        System.out.println(s3==s3.intern());
      //test作为字面量，放入了string pool中，而new时，s3指向的是heap中新生成的string对象，地址不同，为false
        
        String s4=new StringBuilder("abc").toString();//false
        System.out.println(s4==s4.intern()); 
        //同上

        String s5=new StringBuilder("dd").append("ee").toString();
        System.out.println(s5==s5.intern()); //true


        String a = "Alice"; //String Pool
        String b = "Bob";  //String Pool

        String a1 = "Alice"; //String Pool
        String b1 = new String("Bob"); // heap but not in string pool

        System.out.println("a == a1 ? " + (a == a1));//a == a1 ? true
        System.out.println("b == b1 ? " + (b == b1));//b == b1 ? false

	}
}
