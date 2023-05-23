package homeworkweek3;

import java.util.Scanner;

/**
 * 18. Write a Java program to sum values of an array
 */
public class Program18
{
    int no;
    int sum=0;

    public void sumOfArray()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Array  ");
        no=sc.nextInt();

        int a[]=new int[no];
        for(int i=0; i<no;i++)
        {
            System.out.println("a["+i+"] : ");
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }

        System.out.println("Sum of an Array : "+sum);
        sc.close();
    }

    public static void main(String[] args)
    {
        Program18 p18 = new Program18();
        p18.sumOfArray();
    }
}
