import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    //System.out.print("Please enter a the length of the base of the triangle: ");
    Scanner scanner = new Scanner(System.in);
    int base = scanner.nextInt();
    for(int i = base ; i >= 0 ; i--)
    {
      String chr = "*";
      String line = chr.repeat(i);
      System.out.println(line);
    }
  }
}
