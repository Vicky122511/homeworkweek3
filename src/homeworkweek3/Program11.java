package homeworkweek3;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately
 */
public class Program11
{
    public void separate()
    {
        System.out.println("Numbers Divided By 3 are");
        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                System.out.print(" ,"+i);
            }
        }

        System.out.println("\n");
        System.out.println("Numbers Divided By 5 are");
        for(int i=1;i<=100;i++)
        {
            if(i%5==0)
            {
                System.out.print(" ,"+i);
            }
        }
    }

    public static void main(String[] args)
    {
        Program11 p11=new Program11();
        p11.separate();
    }
}
