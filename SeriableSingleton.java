package com.dby.demo.singleton;

import java.io.Serializable;

public class SeriableSingleton implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SeriableSingleton(){
		
	}
	private static final SeriableSingleton sing = new SeriableSingleton();
	public static SeriableSingleton getInstance(){
		return sing;
	}
	
	private Object readResolve(){
		return sing;
	}
}
