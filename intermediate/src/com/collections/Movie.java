package com.collections;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie implements Comparable<Movie> {
	private double rating;
	private	int year;
	private	String name;
@Override
public int compareTo(Movie m) {
	return this.year - m.year;
}

public Movie(double rt,int yr,String m){
	this.rating = rt;
	this.year = yr;
	this.name = m;
	
}
public double getRating() { return rating;}
public String getName(){return name;}
public int getYear(){return year;}

public static void main(String[] args) {
	List<Movie> list = new ArrayList<Movie>();
	list.add(new Movie(8.7,1988,"Star wars empires strikes back"));
	list.add(new Movie(8.8,1990,"Star wars clone wars"));
	list.add(new Movie(7,1987,"Star wars jedi"));
Collections.sort(list);
System.out.println("Movies after sorting");
for(Movie movie:list) {
	System.out.println(movie.getName()+" "+movie.getYear()+
			" "+movie.getRating());
}
}
}
