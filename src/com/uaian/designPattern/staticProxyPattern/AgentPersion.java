/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.staticProxyPattern;

/**  
* <p>Title: agentPersion</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019年4月22日  
*/
public class AgentPersion implements Persion{
	
	private Jay jay;
	
	public AgentPersion(Jay newJay) {
		this.jay = newJay;
	}

	@Override
	public void show() {
		System.out.println("演出前，经济人签合同！");
		jay.show();
		System.out.println("演出结束，经济人收钱！");

	}

}
