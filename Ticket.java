package com.atguigu;

public class Ticket {
	private Integer number=100;	
	public synchronized void sale() {		
		if (number>0) {
			//Thread.currentThread().getName() 获取线程名称
			System.out.println(Thread.currentThread().getName()+"\t 卖出第："+(number--)+"\t 还剩下"+number);
		}
	}
 
}
