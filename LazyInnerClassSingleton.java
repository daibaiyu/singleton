package com.dby.demo.singleton;

public class LazyInnerClassSingleton {
	private LazyInnerClassSingleton(){
		
	}
	private static class InnerLazy{
		private static final LazyInnerClassSingleton sing = new LazyInnerClassSingleton();
	}
	public static final LazyInnerClassSingleton getInstance(){
		return InnerLazy.sing;
	}
}
