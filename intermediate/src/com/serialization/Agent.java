package com.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Agent implements Externalizable {
	String name;
	String address;
	static int age;

	public Agent() {
System.out.println("default constructor is called");	}

	public Agent(String n, String a) {
		this.name = n;
		this.address = a;
		age = 10;
	}

	public static void main(String[] args) {

	}

	@Override
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
		name = (String) oi.readObject();
		address = (String) oi.readObject();
		age = oi.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(address);
		out.writeInt(age);
	}
	@Override
	public String toString() {
		return "name: "+name+"\n"+"address: "+address +"\n"+"age: "+ age+"\n";
	
	}
	
}
