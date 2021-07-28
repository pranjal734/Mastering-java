package com.basics;

public class StringEx {
	public static void main(String[] args) {
        String[] arr = {"java ","puzzlers ","is ","a ","good ","book"};
        StringBuilder message =  new StringBuilder();
        for(String str : arr){
            message.append(str);
        }
        System.out.println(message.toString());
    }
}
