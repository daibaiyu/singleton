package com.dby.demo.singleton;

public class LazyDoubleCheckSingleton {
	private LazyDoubleCheckSingleton(){
		
	}
	private volatile static LazyDoubleCheckSingleton sing = null;
	public static LazyDoubleCheckSingleton getInstance(){
		if(sing==null){
			synchronized (LazyDoubleCheckSingleton.class) {
				if(sing==null){
					sing = new LazyDoubleCheckSingleton();
				}
			}
		}
		return sing;
	}
}
