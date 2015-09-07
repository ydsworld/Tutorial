package com.ydsworld.Thread;

import java.io.IOException;

class TryThread extends Thread {
	private String firstName;
	private String secondName;
	private long aWhile;

	public TryThread(String firstName, String secondName, long delay) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.aWhile = delay;
		setDaemon(true);
	}

	public void run() {
		try {
			while (true) {
				System.out.print(firstName);
				sleep(aWhile);
				System.out.print(secondName + "\n");
			}
		} catch (InterruptedException e) {
			System.out.println(firstName + secondName + e);
		}
	}
}

public class CreatingThread {
	public static void main(String[] args) {
		Thread first = new TryThread("A ", "a ", 200L);
		Thread second = new TryThread("B ", "b ", 300L);
		Thread third = new TryThread("C ", "c ", 500L);
		System.out.println("Press Enter when you have had enought...\n");
		
		first.start();
		second.start();
		third.start();
		
		try {
			System.in.read();
			System.out.println("Enter pressed...\n");
		} catch (IOException e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return;
	}
}
