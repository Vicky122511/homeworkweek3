package homeworkweek3;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program7
{
    int sId,amount,basic,comm;
    String name;

    public void getData()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Sales Id: ");
        sId = sc.nextInt();
        System.out.println("Enter Salesman Name:");
        name=sc.next();
        System.out.println("Enter Basic of Employee: ");
        basic=sc.nextInt();
        sc.close();
    }
    public void calculation()
    {
        if(basic<10000)
        {
            comm = (basic*2)/100;
        }
        else if (basic>=10000 & basic<20000)
        {
            comm = (basic*5)/100;
        }
        else if (basic>=20000 & basic<30000)
        {
            comm = (basic*10)/100;
        }
        else if (basic>=30000 & basic<50000)
        {
            comm = (basic*20)/100;
        }
        else
        {
            comm = (basic*35)/100;
        }
    }
    public void displayData()
    {
        System.out.println("Sales ID: "+sId);
        System.out.println("Employee Name: "+name);
        System.out.println("Basic Pay: "+basic);
        System.out.println("Commission: "+comm);
        System.out.println("---------------------");
        System.out.println("Net Salary:  "+(basic+comm));
    }
    public static void main(String[] args)
    {
        Program7 p7 = new Program7();
        p7.getData();
        p7.calculation();
        p7.displayData();

    }
}
