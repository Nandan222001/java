import java.util.Scanner;

public class AlphaNumericSymbol {
  public static void main(String[] args) {        
    Scanner scanner = new Scanner(System.in);        
    System.out.print("Enter alphabet, number, or symbol: ");
    String input=scanner.next().toLowerCase();
    char eValue = input.charAt(0);
    scanner.close();

    System.out.println("Your input: " +eValue);

    if ('a' <= eValue && eValue <= 'z') {
      if (eValue == 'a' || eValue == 'e' || eValue == 'i' || eValue == 'o' || eValue == 'u') {
          System.out.println(eValue+ " is a lowercase vowel.");
      } 
      else {
          System.out.println(eValue+ " is a lowercase consonant.");
      }
    }
    else if ('A' <= eValue && eValue <= 'Z') {
      if (eValue == 'A' || eValue == 'E' || eValue == 'I' || eValue == 'O' || eValue == 'U') {
        System.out.println(eValue+" is a uppercase alphabet.");
      }
      else {
        System.out.println(eValue+" is a uppercase alphabet.");
      }
    }
    else if ('0' <= eValue && eValue <= '9') {
        System.out.println(eValue+ " is a number.");
    } 
    else {
        System.out.println(eValue+ " is a symbol.");
    }
  }
}