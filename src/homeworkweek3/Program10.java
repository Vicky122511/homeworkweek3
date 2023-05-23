package homeworkweek3;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Program10
{
    int a,b;
    String sym;

    public void getData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number A: ");
        a=sc.nextInt();
        System.out.println("Enter Number B: ");
        b=sc.nextInt();

        System.out.println("Enter Symbol: ");
        sym=sc.next();

        sc.close();
    }
    public void functions()
    {
        if(sym.equals("+"))
        {
            System.out.println("Addition of two Numbers :"+(a+b));
        }
        else if (sym.equals("-"))
        {
            System.out.println("Subtraction of two Numbers :"+(a-b));
        }
        else if (sym.equals("*"))
        {
            System.out.println("Multiplication of two Numbers :"+(a*b));
        }
        else if (sym.equals("/"))
        {
            System.out.println("Division of two Numbers :"+(a/b));
        }
        else
        {
            System.out.println("Invalid Symbol");
        }

    }

    public static void main(String[] args)
    {
        Program10 p10 = new Program10();

        p10.getData();
        p10.functions();
    }
}
