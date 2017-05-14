package com.process.info;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiprocessApplication {

	public static void main(String[] args) throws Throwable {
		System.out.println(Thread.currentThread().getName());
		SpringApplication.run(MultiprocessApplication.class, args);
		startThreads();
		Thread.sleep(5000);
		/*
		 * Thread th = new Thread(new ThreadTest()); th.setDaemon(false);
		 * th.start();
		 */
	}

	public static void startThreads() throws Throwable {
		int poolSize = 10;
		ExecutorService tasks = Executors.newFixedThreadPool(poolSize);
		for (int i = 0; i < 20; i++) {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName());
			tasks.execute(new ThreadTest());
		}
	}

}
