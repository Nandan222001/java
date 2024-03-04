// write a program for to find out given number is palindrome or not

import java.util.*;

public class Palindrome_2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a Number: ");
    int num = sc.nextInt();
    int temp = num, rev = 0, rem;
    while(num>0) {
      rem = num % 10;
      rev = rev * 10 + rem;
      num = num / 10;
    }
    System.out.println(rev);
    if(temp==rev) {
      System.out.println(""+temp+" is a Palindrome.");
    }
    else {
      System.out.println(""+temp+" is not a Palindrome.");
    }
    sc.close();
  }
  
}