/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**  
* <p>Title: DynamicProxy</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019年4月22日  
*/
public class DynamicProxy implements InvocationHandler{
	
	private Object target;
	
	public DynamicProxy(Object newObject) {
		this.target = newObject;
	}

	/* (non-Javadoc)  
	 * <p>Title: invoke</p>  
	 * <p>Description: </p>  
	 * @param proxy
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable  
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])  
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("共同经纪人签合同！");
		Object object = method.invoke(target, args);
		System.out.println("共同经纪人收钱！");
		return object;
	}

}
