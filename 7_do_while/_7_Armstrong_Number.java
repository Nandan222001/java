import java.util.*;
public class _7_Armstrong_Number {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  
    System.out.print("Enter a number to check Armstrong Number: ");
    int num=sc.nextInt();
    int rem, sum=0;
    int temp=0;
    temp=num;
    sc.close();
 
    do {
        rem = num%10;
        sum = sum+(rem*rem*rem);
        num = num/10;
    }while(num>0);
    
    System.out.println(sum);

    if(temp==sum) {
      System.out.println(""+temp+" is Armstrong Number.");
    }
    else {
      System.out.println(""+temp+" is not Armstrong Number.");
    }
  }
}