package com.dby.demo.singleton;

public class LazySimpleSingleton {
	private LazySimpleSingleton(){
		
	}
	private static LazySimpleSingleton sing = null;
	public static synchronized LazySimpleSingleton getInstance(){
		if(sing==null){
			sing = new LazySimpleSingleton();
		}
		return sing;
	}
}
