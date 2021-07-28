package com.basics;

 interface AmbiguityB {
	    default void printName(){
	        System.out.println("from A");
	    }
	}

	 interface AmbiguityC {
	    default void printName() {
	        System.out.println("from B");
	    }
	}

	public class AmbiguityA implements AmbiguityC,AmbiguityB {
	    public static void main(String[] args) {
	        new AmbiguityA().printName();
	    }

	    public void printName() {
	    	AmbiguityB.super.printName();
	    }
	}
