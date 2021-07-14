package com.basics;

public class PalindromeEx {
public static void main(String[] args) {
int sum = 0,r,temp;
int n =454;
temp=n;
while(n>0) {
r= n%10;
sum = sum*(10+r);
n=n/10;
}
if(temp==sum) {
	System.out.println("palindrome no.");
}else {
	System.out.println("not a palindrome no");
}

}
}