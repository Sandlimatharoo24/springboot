package com.process.info;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
	while(true){
		try {
			System.out.println("Runnable Thread");
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("Runnable 1000 Completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	}

}
