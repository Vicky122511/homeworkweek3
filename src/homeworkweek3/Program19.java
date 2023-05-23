package homeworkweek3;

import java.util.Scanner;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
public class Program19
{
    int no;
    int sum=0;

    public void avg()
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
        int avg1=sum/a.length;
        System.out.println("Average of Array : "+avg1);
        sc.close();
    }

    public static void main(String[] args)
    {
        Program19 p19 = new Program19();
        p19.avg();
    }
}
