package homeworkweek3;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Program2
{
    int year;
    public void leapYear()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year");
        year = sc.nextInt();
        if(year%4 ==0)
        {
            System.out.println("Entered Year is Leap");
        }
        else
        {
            System.out.println("Entered Year is not Leap ");
        }
    }

    public static void main(String[] args)
    {
        Program2 p2 = new Program2();
        p2.leapYear();
    }
}
