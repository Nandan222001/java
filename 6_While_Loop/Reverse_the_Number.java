import java.util.*;
public class Reverse_the_Number {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the number you want to reverse: ");
    int num=sc.nextInt();
    int rem, rev=0;
    sc.close();

    while(num>0) {
        rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;
    }
    System.out.println(rev);
  }
}
