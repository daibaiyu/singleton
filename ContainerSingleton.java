package com.dby.demo.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {
	private ContainerSingleton(){
		
	}
	private static Map<String,Object> iocMap = new ConcurrentHashMap<>();
	public static Object getInstance(String className){
		synchronized (iocMap) {
			if(!iocMap.containsKey(className)){
				Object obj = null;
				try {
					obj = Class.forName(className).newInstance();
					iocMap.put(className, obj);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return obj;
			}else{
				return iocMap.get(className);
			}
		}
	}
}
