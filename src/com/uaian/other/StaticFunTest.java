/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.other;

/**  
* <p>Title: StaticFunTest</p>  
* <p>Description: ���Ծ�̬����</p>  
* @author kainan  
* @date 2019��4��19��  
*/
public class StaticFunTest {
	private int i = 1;
	public static void main(String[] args) {
		StaticFunTest.outNum();
	}
	public static void outNum() {
		//��̬��������ʹ�÷Ǿ�̬��Ա������������ʵ��������
		//��Ϊ��̬�������౻���ص�ʱ���Ѿ�����ʼ������ʱ��û�г�ʼ���Ǿ�̬��Ա����
		StaticFunTest staticFunTest = new StaticFunTest();
		System.out.println(staticFunTest.i);
	}
}
