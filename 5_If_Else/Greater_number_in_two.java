import java.util.*;
public class Greater_number_in_two {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int num1=sc.nextInt();
    System.out.print("Enter Second Number: ");
    int num2=sc.nextInt();
    if(num1>num2) {
      System.out.println(+num1+" is greater than "+num2);
    }
    else {
      System.out.println(+num2+" is greater than "+num1);
    }
    sc.close();
  }
}
