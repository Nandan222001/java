import java.util.*;
public class Percentage {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter marks of English : ");
    int english=sc.nextInt();
    System.out.print("Enter marks of Marathi : ");
    int marathi=sc.nextInt();
    System.out.print("Enter marks of Hindi   : ");
    int hindi=sc.nextInt();
    System.out.print("Enter marks of Maths   : ");
    int maths=sc.nextInt();
    System.out.print("Enter marks of Science : ");
    int science=sc.nextInt();
    int total=english+marathi+hindi+maths+science;
    System.out.println("Total Marks: \t"+total+" / 500");
    float percent=(total*100)/500;

    if(english>35 || marathi>35 || hindi>35 || maths>35 || science>35) {
      if(percent>=90) {
        System.out.println("Grade : O (OutStanding)");
        System.out.println("Percent : "+percent+" %");
      }
      else if(percent>=80 && percent<=89) {
        System.out.println("Grade : A+ (Excellent)");
        System.out.println("Percent : "+percent+" %");
      }
      else if(percent>=70 && percent<=79) {
        System.out.println("Grade : A (Nice)");
        System.out.println("Percent : "+percent+" %");
      }  
      else if(percent>=60 && percent<=69) {
        System.out.println("Grade : B+ (Good)");
        System.out.println("Percent : "+percent+" %");
      }
      else if(percent>=50 && percent<=59) {
        System.out.println("Grade : B (Not Bad)");
        System.out.println("Percent : "+percent+" %");
      }
      else if(percent>=41 && percent<=49) {
        System.out.println("Grade : C (Somehow Passed)");
        System.out.println("Percent : "+percent+" %");
      }
      else if(percent<=35) {
        System.out.println("Grade : TH (ReAppear)");
        System.out.println("Percent : "+percent+" %");
      }
      else {
        System.out.println("Invalid Input");
      }
    }
    else {
      System.out.println("You are Fail");
    }
    

  }
}
