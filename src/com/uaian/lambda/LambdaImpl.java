package com.uaian.lambda;
/**
 * ����lambdaʵ��
 * @author Administrator
 *
 */
public class LambdaImpl {
	public static void main(String[] args) {
		ILambdaOut iLambdaOut = () -> System.out.println("���ǵ���lambda���!!!"); //����ʹ�á�{ }�� ����
		//����ǵ���������䣬lambda���Բ�ʹ��return
		iLambdaOut.sysout();
	}
}
