import java.util.*;
public class Voting_age {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age=sc.nextInt();
    if(age>=18) {
      System.out.println("You can Vote.");
    }
    else {
      System.out.println("You can't Vote.");
    }
  }
}
