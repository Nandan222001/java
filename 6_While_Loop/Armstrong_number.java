import java.util.*;
public class Armstrong_number {
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

    int sum=0; 
    // int store=0;
    int store=rev;
    while(num>0)
    {
        rem = num%10;
        sum = sum+(rem*rem*rem);
        num = num/10;
    }
    System.out.println(sum);

    if(store==sum) {
      System.out.println(""+temp+" is Armstrong Number.");
    }
    else {
      System.out.println(""+temp+" is not Armstrong Number.");
    }
  }
}
