package com.prachi.patterns;

public class ThreadUnsafeSingleton {
	private static ThreadUnsafeSingleton instance = null;	
	
	private ThreadUnsafeSingleton() {}
	
	public static ThreadUnsafeSingleton getInstance(){
		if(instance == null){
			instance = new ThreadUnsafeSingleton();
		}
		return instance;
	}
	
	public static void main(String[] args){
		ThreadUnsafeSingleton instance1 = ThreadUnsafeSingleton.getInstance();
		ThreadUnsafeSingleton instance2 = ThreadUnsafeSingleton.getInstance();

		System.out.println("Single instance: " + (instance1 == instance2));
	}
}
