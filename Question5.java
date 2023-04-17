import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    //System.out.print("Enter the number of integers: ");
    int numIntegers = scanner.nextInt();
    int[] freqArray = new int[1001];
    for (int i = 0; i < numIntegers; i++) 
        {
        //System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        freqArray[num]++;
        }
    int maxFreq = 0;
    int mode = 0;
    for (int i = 1; i <= 1000; i++) 
        {
        if (freqArray[i] > maxFreq) 
            {
            maxFreq = freqArray[i];
            mode = i;
            }
        }
        System.out.println(mode);
  }
}
