package com.dby.demo.singleton;

public class HungryStaticSingleton {
	private HungryStaticSingleton(){
		
	}
	private static final HungryStaticSingleton sing;
	static{
		sing = new HungryStaticSingleton();
	}
	public static HungryStaticSingleton getInstance(){
		return sing;
	}
}
