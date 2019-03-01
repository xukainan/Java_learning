package com.uaian.lambda;
/**
 * 采用lambda实现
 * @author Administrator
 *
 */
public class LambdaImpl {
	public static void main(String[] args) {
		ILambdaOut iLambdaOut = () -> System.out.println("这是单行lambda输出!!!"); //多行使用“{ }” 即可
		//如果是单条返回语句，lambda可以不使用return
		iLambdaOut.sysout();
	}
}
