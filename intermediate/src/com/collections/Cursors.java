package com.collections;

import java.io.*;
import java.util.*;

public class Cursors {
	// A Java program to demonstrates the
	// difference between Enumeration,
	// Iterator, and ListIterator

		
		public static void main(String args[])
		{
			
			// Creating a vector object
			Vector<Integer> v = new Vector<Integer>();
			
			// Adding elements to the vector object
			v.add(10);
			v.add(20);
			v.add(30);
			v.add(40);
			v.add(50);
			
			System.out.println("Enumeration: ");
			
			// Creating an Enumeration object
			Enumeration e = v.elements();
			
			// Checking the next element availability
			while (e.hasMoreElements()) {
				
				// Moving cursor to the next element
				int i = (Integer)e.nextElement();
				
				// Printing the element
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println();
			
			System.out.println("Iterator: ");
			
			// Creating Iterator object
			Iterator<Integer> itr = v.iterator();
			
			// Checking the next element availability
			while (itr.hasNext()) {
				
				// Moving cursor to the next element
				int i = (Integer)itr.next();
				
				// Checking if i == 10 then
				// remove the element
				if (i == 10)
					itr.remove();
			}
			System.out.println(v);
			System.out.println();
			
			System.out.println("ListIterator: ");
			
			// Creating ListIterator object
			ListIterator<Integer> ltr = v.listIterator();
			
			// Checking the next element availability
			while (ltr.hasNext()) {
				
				// Moving cursor to the next element
				int i = (Integer)ltr.next();
				
				// Performing add, remove, and
				// replace operation
				if (i == 20)
					ltr.remove();
				
				else if (i == 30)
					ltr.add(60);
				
				else if (i == 40)
					ltr.set(100);
			}
			
			System.out.println(v);
		}
	}

