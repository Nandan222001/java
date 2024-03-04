import java.util.*;
public class LeapYear {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Year: ");
    int year=sc.nextInt();
    if(year%4==0) {
      System.out.println("Its a Leap Year.");
    }
    else {
      System.out.println("Its not a Leap Year.");
    }
    sc.close();
  }
}
