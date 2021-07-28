package com.basics;

public class FinalEx
	{
	    final static short x = 2;
	    public static final int y = 0;
	    
	    public static void main(String [] args)
	    {
	        for (int z = 0; z < 3; z++)

	            switch (z)
	            {
	                case y: System.out.print("0 ");    // LINE M

	                case x - 1: System.out.print("1 "); // LINE N

	                case x: System.out.print("2 ");    // LINE O
	            }
	    }
	}
