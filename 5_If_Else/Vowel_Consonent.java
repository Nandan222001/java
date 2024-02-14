import java.util.*;
public class Vowel_Consonent {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any alphabet : ");
    char alphabet=sc.next().charAt(0);
    
    if(alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u') {
      System.out.println(alphabet+" is a Vowel.");
    }
    else {
      System.out.println(alphabet+" is a Consonent.");
    }
    System.out.println(alphabet);
  }
}
