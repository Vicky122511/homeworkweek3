package homeworkweek3;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program12
{
    char value;

    public void getData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number/Symbol/Special Character");
        value = sc.next().charAt(0);

        if((value>='A' && value<='Z') || (value>='a' && value<='z'))
        {
            System.out.println("Enter value is from Alphabet");
        }
        else if ((value>='0' && value<='9'))
        {
            System.out.println("Enter value is from Number");
        }
        else
        {
            System.out.println("Enter value is from Special Character");
        }
    }

    public static void main(String[] args)
    {
        Program12 p12 = new Program12();
        p12.getData();
    }
}
