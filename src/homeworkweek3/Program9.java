package homeworkweek3;

import java.util.Scanner;

/**
 *9. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Program9
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
        switch (c)
        {
            case "A":
                System.out.println("America");
                break;
            case "B":
                System.out.println("Boston");
                break;
            case "C":
                System.out.println("Chessington");
                break;
            case "D":
                System.out.println("Devon");
                break;
            case "E":
                System.out.println("Essex");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("Invalid Entry");
                break;

        }
    }

    public static void main(String[] args)
    {
        Program8 p8 = new Program8();
        p8.getData();
        p8.city();
    }
}
