/**  
* <p>Copyright: Copyright (c) 2019</p>  
* <p>Company: https://github.com/xukainan/java_learning</p>  
*/  
package com.uaian.designPattern.staticProxyPattern;

/**  
* <p>Title: agentPersion</p>  
* <p>Description: </p>  
* @author kainan  
* @date 2019��4��22��  
*/
public class AgentPersion implements Persion{
	
	private Jay jay;
	
	public AgentPersion(Jay newJay) {
		this.jay = newJay;
	}

	@Override
	public void show() {
		System.out.println("�ݳ�ǰ��������ǩ��ͬ��");
		jay.show();
		System.out.println("�ݳ���������������Ǯ��");

	}

}
