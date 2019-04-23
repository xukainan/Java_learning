/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**  
* <p>Title: CglibProxy</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019��4��22��  
*/
public class CglibProxy implements MethodInterceptor{
	private Object target;	

	public Object getInstance(Object newTarget) {
		this.target = newTarget;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("��ͬ������ǩ��ͬ��");
		Object result = methodProxy.invoke(target, args);
		System.out.println("��ͬ��������Ǯ��");
		return result;
	}

}
