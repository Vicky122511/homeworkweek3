package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________
 */
public class Program3
{
    int rno,math,science,english,total;
    float per;
    String name,res,grade;

    public void result()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student roll number :");
        rno=sc.nextInt();
        System.out.println("Enter Student Name :");
        name = sc.next();
        System.out.println("Enter Math's Marks :");
        math=sc.nextInt();
        System.out.println("Enter Science's Marks :");
        science=sc.nextInt();
        System.out.println("Enter English Marks :");
        english=sc.nextInt();

        if(math<=0 | math>100)
        {
            System.out.println("Invalid Maths Marks");
            math=0;
            System.out.println("Enter Math's Marks :");
            math=sc.nextInt();
        }else if(science<=0 | science>100)
        {
            System.out.println("Invalid Science Marks");
            science=0;
            System.out.println("Enter Science's Marks :");
            science=sc.nextInt();
        } else if (english<=0 | english>100)
        {
            System.out.println("Invalid English Marks");
            english=0;
            System.out.println("Enter English Marks :");
            english=sc.nextInt();
        }
        else
        {

            //System.out.println(math + english + science);
        }
       total = math + english +science;
        per= (total*100) /300;
        if(per>=35)
        {
            res="Pass";
        }
        else
        {
            res="Fail";
        }

        if(per>=80)
        {
            grade="A+";
        } else if (per>=60 & per<80)
        {
            grade = "A";
        } else if (per>=50 & per<60)
        {
            grade="B";
        }
        else
        {
            grade="C";
        }

        sc.close();
    }
    public void display()
    {
        System.out.println("-------------------------------------------");
        System.out.println("|                                          |");
        System.out.println("|                 Mark Sheet               |");
        System.out.println("|                                          |");
        System.out.println("-------------------------------------------");
        System.out.println("|    Name                 :        "+name +"    |");
        System.out.println("|    Roll No:            "+rno +"               |");
        System.out.println("|    Subjects                         Marks|");
        System.out.println("-------------------------------------------");
        System.out.println("|    Maths                :        "+math+"     |");
        System.out.println("|    Science:           "+science+"             |");
        System.out.println("|    English:           "+english+"             |");
        System.out.println("-------------------------------------------");
        System.out.println("|    Total                :       "+total+"     |");
        System.out.println("-------------------------------------------");
        System.out.println("|    Percentage           :    "+per+"          |");
        System.out.println("|    Result               :    "+res+"          |");
        System.out.println("|    Grade                :    "+grade+"        |");
        System.out.println("|                                               |");
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args)
    {
        Program3 p3 = new Program3();
        p3.result();
        p3.display();
    }
}
