package homeworkweek3;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program8
{
    String c;

    public void getData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        c=sc.next();
        sc.close();

    }
    public void city()
    {
        if(c.equals("A"))
        {
            System.out.println("America");
        }
        else if (c.equals("B"))
        {
            System.out.println("Boston");
        }
        else if (c.equals("C"))
        {
            System.out.println("Chessington");

        }
        else if (c.equals("D"))
        {
            System.out.println("Devon");
        }
        else if (c.equals("E"))
        {
            System.out.println("Essex");
        }
        else if (c.equals("F"))
        {
            System.out.println("Feltham");
        }
        else
        {
            System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args)
    {
        Program8 p8 = new Program8();
        p8.getData();
        p8.city();
    }
}
