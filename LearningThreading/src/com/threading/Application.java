package com.threading;

public class Application {
	public static void main(String args[]) {

		Task taskRunner = new Task();
		taskRunner.start();

		System.out.println("Hello there...");

		Task taskRunner2 = new Task();
		taskRunner2.start();
	}
}

class Task extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("ThreadID: " + Thread.currentThread().getId() + " prints number: " + i);
		}
	}
}
