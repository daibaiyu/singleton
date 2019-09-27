package com.dby.demo.singleton;

public enum EnumSingleton {
	INSTANCE;
	private Object data;
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static Object getInstance(){
		return INSTANCE.getData();
	}
}
