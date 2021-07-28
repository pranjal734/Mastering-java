package com.serialization;

import java.io.*;

public class ExternalizeAgent {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Agent agent = new Agent("pranjal", "ujjain");
		Agent newAgent = null;

		FileOutputStream fo = new FileOutputStream("agent.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		oo.writeObject(agent);
		
		//deserealize the agent
		FileInputStream fi = new FileInputStream("agent.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		newAgent = (Agent)oi.readObject();
		
		System.out.println("agent name is "+agent);
		System.out.println("new agent is "+newAgent);
	}
}
