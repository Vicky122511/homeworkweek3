package homeworkweek3;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================
 */
public class Program5
{
    int eId,basic;
    int hra,da,ta,pf,gross;
    String name;

    public void getData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Id ");
        eId= sc.nextInt();
        System.out.println("Enter Employee Name");
        name=sc.next();
        System.out.println("Enter Basic Salary of Employee");
        basic=sc.nextInt();
        sc.close();
    }
    public void calculation()
    {
        hra= (basic *10)/100;
        da=(basic*8)/100;
        ta=(basic*9)/100;
        pf=(basic*20)/100;
        gross=basic+hra+da+ta-pf;

    }

    public void displayData()
    {
        System.out.println("----------------------------------------");
        System.out.println("|             Salary Slip              |");
        System.out.println("|                                      |");
        System.out.println("----------------------------------------");
        System.out.println("|Employee Id               : " + eId +"         |");
        System.out.println("|Employee Name             : " + name +"     |");
        System.out.println("----------------------------------------");
        System.out.println("|Basic Salary              : " + basic +"     |");
        System.out.println("|HRA 10%                   : " + hra +"      |");
        System.out.println("|TA 9%                     : " + ta +"       |");
        System.out.println("|DA 8%                     : " + da +"       |");
        System.out.println("|PF -20%&                  : " + pf +"      |");
        System.out.println("----------------------------------------");
        System.out.println("|Gross Salary              : " + gross +"     |");
        System.out.println("|--------------------------------------|");
        System.out.println("|--------------------------------------|");
  }

    public static void main(String[] args)
    {
        Program5 p5 = new Program5();
        p5.getData();
        p5.calculation();
        p5.displayData();

    }
}
