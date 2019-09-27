package com.dby.demo.singleton;

public class ThreadLocalSingleton {
	private ThreadLocalSingleton(){
		
	}
	private static final ThreadLocal<ThreadLocalSingleton> sing = new ThreadLocal<ThreadLocalSingleton>(){
		protected ThreadLocalSingleton initialValue(){
			return new ThreadLocalSingleton();
		}
	};
	public static ThreadLocalSingleton getInstance(){
		return sing.get();
	}
}
