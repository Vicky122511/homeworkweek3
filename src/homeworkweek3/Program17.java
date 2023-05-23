package homeworkweek3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
public class Program17
{
    int no;
    public void arraySort()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Array  ");
        no=sc.nextInt();

        int a[]=new int[no];
        String name[]=new String[no];

        for(int i=0; i<no;i++)
        {
            System.out.println("a["+i+"] : ");
            a[i]=sc.nextInt();
            System.out.println("name["+i+"] :");
           name[i]=sc.next();
        }

        System.out.println("Number Array Sort");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("\n");
        System.out.println("String Array Sort");
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

        sc.close();
    }

    public static void main(String[] args)
    {
        Program17 p17 = new Program17();
        p17.arraySort();
    }
}
