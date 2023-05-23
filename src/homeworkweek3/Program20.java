package homeworkweek3;

import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */
public class Program20
{
    int no,sno;


    public void specificValue()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Array  ");
        no=sc.nextInt();

        int a[]=new int[no];
        for(int i=0; i<no;i++)
        {
            System.out.println("a["+i+"] : ");
            a[i]=sc.nextInt();
        }

        System.out.println("Enter Specific value :");
        sno=sc.nextInt();
        for(int i=0; i<a.length;i++)
        {
            if(a[i]==sno)
            {
                System.out.println("Yes it's inside Array");
            }
            else
            {
                System.out.println("No it's not inside Array");
                break;
            }
        }

        sc.close();
    }

    public static void main(String[] args)
    {
        Program20 p20 = new Program20();
        p20.specificValue();
    }
}
