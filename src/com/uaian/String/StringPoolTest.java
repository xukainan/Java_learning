/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.String;

/**  
* <p>Title: StringPoolTest</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019��4��24��  
*/
public class StringPoolTest {
	 public static void main(String[] args) {
		String s1 = new StringBuilder("ja").append("va").toString();
		System.out.println(s1 == s1.intern());
		//java�ǹؼ��֣���string pool�п϶��ǻ��е�
		
		String s2 = new StringBuilder("xu").append("kainan").toString();
		System.out.println(s2 == s2.intern());
		//xukainan �ڳ���û�У�������heap�д��ڣ���internʱ����ֱ�ӷ��ظ�heap�е�����
		
        String s3=new String("test");  //false
        System.out.println(s3==s3.intern());
      //test��Ϊ��������������string pool�У���newʱ��s3ָ�����heap�������ɵ�string���󣬵�ַ��ͬ��Ϊfalse
        
        String s4=new StringBuilder("abc").toString();//false
        System.out.println(s4==s4.intern()); 
        //ͬ��

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
