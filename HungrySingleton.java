package com.dby.demo.singleton;

public class HungrySingleton {
	private HungrySingleton(){
		
	}
	private static final HungrySingleton sing = new HungrySingleton();
	
	public static HungrySingleton getInstance(){
		return sing;
	}
}
