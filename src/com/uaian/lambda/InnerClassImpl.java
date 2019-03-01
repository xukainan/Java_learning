package com.uaian.lambda;
/**
 * 传统内部类实现
 * @author kainan
 *
 */
public class InnerClassImpl {
	public static void main(String[] args) {
		ILambdaOut iLambdaOut = new ILambdaOut() {			
			@Override
			public void sysout() {
				System.out.println("这是传统内部类实现 !!!");
			}
		};
		iLambdaOut.sysout();
	}
}
