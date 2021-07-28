package com.hackerearth;

public class SingletonEx {
	    private volatile static SingletonEx instance;
	    public static String str;
	    private SingletonEx() {}
	    
	    static SingletonEx getSingleInstance() {
	        if (instance == null) {
	            synchronized (SingletonEx.class) {
	                if (instance == null) {
	                    instance = new SingletonEx();
	                }
	            }
	        }
	        return instance;
	    }

	}
