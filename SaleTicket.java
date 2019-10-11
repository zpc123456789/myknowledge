package com.atguigu;

//多线程简单案例  卖票

public class SaleTicket {
	public static void main(String[] args) {
		
		Ticket ticket = new Ticket();
		
		//Thread(Runnable target, String name) Allocates a new Thread object.
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				 for(int i = 0;i<35;i++) {
					 ticket.sale();
				 }
				
			}
		}, "A").start();
		
		//匿名内部类版
		new Thread(new Runnable() {
			public void run() {
				for(int a=0;a<40;a++) {
					ticket.sale();
				}
			}
		}, "B").start();
		
		//拉姆达表达式版
		new Thread(() -> { for(int a=0;a<40;a++) ticket.sale(); },"C" ).start();	
		new Thread(() -> { for(int a=0;a<40;a++) ticket.sale(); },"D" ).start();	
	}

}


















