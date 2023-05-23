package homeworkweek3;
/**
 * 6. Write a java program to input any number
 * and find out if it’s odd or even
 */

import java.util.Scanner;

public class Program6
{
    public void oddOrEven()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int a =sc.nextInt();

        if(a%2 == 0)
            System.out.println("Entered Number is Even");
        else
            System.out.println("Entered Number is Odd");

        sc.close();
    }
    public static void main(String[] args)
    {
        Program1 p1 = new Program1();
        p1.oddOrEven();

    }
}
