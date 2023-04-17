public class Question2
{
  import java.util.Scanner;
  public static void main(String[] args)
  {
    System.out.print("Please enter you height in meters: ");
    Scanner in1 = new Scanner(System.in);
    double height = in1.nextDouble();
    System.out.print("Please enter you weight in kg: ");
    Scanner in2 = new Scanner(System.in);
    double weight = in2.nextDouble();
    double bmi = weight / (height * height);
    System.out.println("Your BMI is " + bmi);
  }
}
