package com.uaian.lambda;

/**
 * 这是一个接口
 * @author kainan
 *
 */
@FunctionalInterface //用来标识这个接口使用函数式编程，因为采用函数式编程的接口中，只能由一个方法，否则会编译报错
public interface ILambdaOut {
	void sysout();
}
