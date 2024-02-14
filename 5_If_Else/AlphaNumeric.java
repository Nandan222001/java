import java.util.*;
public class AlphaNumeric {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Alphabet, Number or Symbol: ");
    String eValue=sc.next().charAt(0);

    System.out.println(eValue);

    if (eValue=="a" || eValue=="e" || eValue=="i") {
      System.out.println(eValue+" is an Alphabet in Lowercase.");
    }
  }
}
