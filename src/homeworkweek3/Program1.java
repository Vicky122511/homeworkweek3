package homeworkweek3;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Program1
{
    public void oddOrEven()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int a =sc.nextInt();

        String result= (a%2 == 0) ? "Number is Even" : "Number is Odd" ;
        System.out.println(result);

    }
    public static void main(String[] args)
    {
        Program1 p1 = new Program1();
        p1.oddOrEven();

    }

}
