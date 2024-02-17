import java.util.*;

public class Square_of_any_Number {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("********Square of Numbers*********");
    System.out.print("Enter the number: ");
    int num=sc.nextInt();
    sc.close();
    int i=1;
    while (i<=10) {
      System.out.println(Math.pow(num,i));
      i++;
    }
  }
  
}
