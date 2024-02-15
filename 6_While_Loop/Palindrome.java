import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number to check Palindrome: ");
    int num=sc.nextInt();
    int rem, rev=0;
    int temp=0;
    temp=num;
    
    while(num>0) {
      rem = num % 10;
      rev = rev * 10 + rem;
      num = num / 10;
  }
  System.out.println(rev);
  if (temp==rev) {
    System.out.println(""+rev+" is a Palindrome.");
  }
  else {
    System.out.println(""+rev+" is not a Palindrome.");
  }
  }
}
