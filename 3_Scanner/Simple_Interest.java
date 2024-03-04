import java.util.*;
public class Simple_Interest {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Principal amount: ");
    int p=sc.nextInt();
    System.out.print("Enter the Rate of Interest: ");
    int r=sc.nextInt();
    System.out.print("Enter the period of time: ");
    int n=sc.nextInt();
    int si=(p*n*r)/100;
    System.out.println("\nThe Principal amount is   : "+p+" rs");
    System.out.println("The Rate of Interest is   : "+r+" %");
    System.out.println("The Period of time is     : "+n+" years");
    System.out.println("The Simple Interest is    : "+si+" rs");
    System.out.println("The Total amount is       : "+(p+si)+" rs");
    sc.close();
  }
}
