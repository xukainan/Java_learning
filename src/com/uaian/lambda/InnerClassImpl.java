package com.uaian.lambda;
/**
 * ��ͳ�ڲ���ʵ��
 * @author kainan
 *
 */
public class InnerClassImpl {
	public static void main(String[] args) {
		ILambdaOut iLambdaOut = new ILambdaOut() {			
			@Override
			public void sysout() {
				System.out.println("���Ǵ�ͳ�ڲ���ʵ�� !!!");
			}
		};
		iLambdaOut.sysout();
	}
}
