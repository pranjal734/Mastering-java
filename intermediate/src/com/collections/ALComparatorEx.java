package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ALComparatorEx {
	private int rollNo;
	private String name;
	private String college;

	public ALComparatorEx(int rollNo, String name, String college) {
		this.name = name;
		this.rollNo = rollNo;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public String getCollege() {
		return college;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public static void main(String[] args) {
		ArrayList<ALComparatorEx> al = new ArrayList<ALComparatorEx>();
		al.add(new ALComparatorEx(1011, "pranjal", "MIT"));
		al.add(new ALComparatorEx(1003, "ankur", "MIT"));
		al.add(new ALComparatorEx(1008, "ajesthi", "NAS"));
		
		System.out.println("Name in Sorting order:");
		   Collections.sort(al, ALComparatorEx.nameComp);

		   for(ALComparatorEx str: al){
				System.out.println(str);
		   }
				System.out.println("RollNo in Sorting order:");
				   Collections.sort(al, ALComparatorEx.rollComp);

				   for(ALComparatorEx str: al){
						System.out.println(str);
		   }
		// Collections.sort(al);
		// System.out.println(al);
	}
public static Comparator<ALComparatorEx> nameComp = new Comparator<ALComparatorEx>() {
	public int compare(ALComparatorEx n1, ALComparatorEx n2) {
		String name1 = n1.getName().toLowerCase();
		String name2 = n2.getName().toLowerCase();
		return name1.compareTo(name2);
	}
};
public static Comparator<ALComparatorEx> rollComp = new Comparator<ALComparatorEx>() {
public int compare(ALComparatorEx r1,ALComparatorEx r2) {
	int rollNo1 = r1.getRollNo();
	int rollNo2 = r2.getRollNo();
	return rollNo1-rollNo2;
}
};
	public String toString() {
		return "[rollNo=" + rollNo + ",name=" + name + ",college=" + college + "]";
	}
}