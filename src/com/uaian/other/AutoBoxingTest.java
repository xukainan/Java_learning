/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.other;

/**  
* <p>Title: AutoBoxingTest</p>  
* <p>Description: �Զ�װ�䡢����ԭ��</p>  
* @author kainan  
* @date 2019��4��16��  
*/
public class AutoBoxingTest {
	public static void main(String[] args) {
		Integer i0 = 0;
		Integer i1 = 1;
		Integer i2 = 1;
		Integer i3 = new Integer(1);
		Integer i4 = new Integer(1);
		Integer i5 = new Integer(0);
		Float f1 = 1f;
		Float f2 = 1f;
		
		//1��intֵֻҪ��-128��127֮����Զ�װ����󶼴ӻ����л�ȡ�ģ�����Ϊtrue
		System.out.println(i1 == i2);
		//2���漰�����ֵļ��㣬�ͱ����Ȳ����int�����ӷ����㣬���Բ������ǵ�ֵ�Ƿ���-128��127֮�䣬ֻҪ����һ����Ϊtrue
		System.out.println(i1 == i2 + i0);
		//3.�Ƚϵ��Ƕ����ڴ��ַ������Ϊfalse
		System.out.println(i4 == i3);
		//4��ͬ��2�����ͣ��������ӷ����㣬�Աȵ������֣�����Ϊtrue
		System.out.println(i4 == i5 + i3);
		//5.�����͵�װ�����û��ʹ�û��棬ÿ�ζ���new������false
		System.out.println(f1 == f2);
	}
}
