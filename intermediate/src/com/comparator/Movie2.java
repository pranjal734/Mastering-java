package com.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.collections.Movie;

public class Movie2 implements Comparable<Movie2> {
	private double rating;
	private int year;
	private String name;

	public Movie2(double rt, int yr, String m) {
		this.rating = rt;
		this.name = m;
		this.year = yr;

	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Movie2 m) {

		return this.year - m.year;
	}

	public static void main(String[] args) {
		List<Movie2> list = new ArrayList<Movie2>();
		list.add(new Movie2(8.7, 1988, "Star wars empires strikes back"));
		list.add(new Movie2(8.8, 1990, "Star wars clone wars"));
		list.add(new Movie2(7, 1987, "Star wars jedi"));
		System.out.println("Movies after sorting");

		System.out.println("Sorted by name");
		CompareName cname = new CompareName();
		Collections.sort(list, cname);
		for (Movie2 movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

		System.out.println("Sorted by rating");
		CompareRating crat = new CompareRating();
		Collections.sort(list, crat);
		for (Movie2 movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

		System.out.println("Sorted by year");
		Collections.sort(list);
		for (Movie2 movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

	}
}
