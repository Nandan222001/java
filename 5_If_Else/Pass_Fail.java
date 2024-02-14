import java.util.*;
public class Pass_Fail {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Marks obtained: ");
    float marks=sc.nextFloat();
    System.out.print(""+marks+" out of (how much): ");
    int total=sc.nextInt();
    float per=(marks*100)/total;

    System.out.println("/*********RESULT*********/");
    System.out.println("Marks: "+marks+" / "+total);
    System.out.println("Percent: "+per+" %");

    if(per>35 && per<=100) {
      System.out.println("You are FAILED!!!");
    }
    else {
      System.out.println("You are PASSED!!!");
    }
  }
}
