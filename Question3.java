import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    //System.out.print("Please enter a integer: ");
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    int square = i * i;
    //System.out.println("Your Squared Number is: " + square);
    System.out.println(square);
  }
}
