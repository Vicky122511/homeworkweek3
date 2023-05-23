package homeworkweek3;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program16
{
    int number;
    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number ");
        number = sc.nextInt();
        sc.close();
    }
    public void isPositiveNegativeZero()
    {
        if(number<0)
        {
            System.out.println("Number is Negative");
        }
        else if (number>0)
        {
            System.out.println("Number is Positive");
        }
        else
        {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args)
    {
        Program16 p16= new Program16();
        p16.getData();
        p16.isPositiveNegativeZero();
    }
}
