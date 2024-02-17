import java.util.*;

public class Table_of_2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Table you want to print: ");
    int table=sc.nextInt();
    sc.close();
    
    int i=1;
    while (i<=10) {
      System.out.println(" "+table+" * "+i+" = "+(i*table));
      i++;
    }
  }
}
