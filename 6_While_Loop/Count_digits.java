import java.util.*;
public class Count_digits {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int count = 0;
    int temp = num;
    sc.close();

    while (num > 0) {
      count++;
      num = num / 10;
    }
    System.out.println("The digits count of "+temp+" is: "+count);
  }
}
