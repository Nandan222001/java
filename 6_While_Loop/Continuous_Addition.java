import java.util.*;
public class Continuous_Addition {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int choice=1;

    while(choice==1) {
      System.out.print("Enter first number: ");
      int num1=sc.nextInt();
      
      System.out.print("Enter second number: ");
      int num2=sc.nextInt();

      int sum=num1+num2;

      System.out.println("The sum is: "+sum);
      
      System.out.println("\nDo you want to Continue?");
      System.out.println("1 = Continue, 2 = Exit");
      choice=sc.nextInt();
      sc.close();
    }
  }
}
