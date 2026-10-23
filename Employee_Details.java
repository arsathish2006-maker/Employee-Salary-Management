/*Write a Java program using methods to manage an employee's salary.
Requirements:
1. Get the employee's name, basic salary, and experience from the user.
2. Create a method to calculate the HRA (20% of basic salary).
3. Create a method to calculate the DA (10% of basic salary).
4. Create a method to calculate the bonus based on experience:
   - Experience ≥ 5 years: 15% of basic salary.
   - Experience < 5 years: 5% of basic salary.
5. Create a method to calculate the gross salary.
6. Create a method to display the employee details and salary breakdown. */

import java.util.Scanner;
public class Employee_Details {
    static void Employee_Address(String name,int salary,int exprience){
       System.out.println("name:"+name);
       System.out.println("salary:"+salary);
       System.out.println("exprience:"+exprience);
    }
    static int Hra(int salary){
        return salary*20/100;
    }
    static int Da(int salary){
        return salary*10/100;
    }
    static int bonus(int exprience,int salary){
     if(exprience >= 5){
        return (salary*15)/100 ;
    }
     else{
        return (salary*5)/100;
    }
    }
    static int  grass_salary(int salary,int Hra,int Da,int bonus){
        return salary+Hra+Da+bonus;
    }
   public static void main(String arug[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the name");
    String name = scan.nextLine();
    System.out.println("enter the salary");
    int salary = scan.nextInt();
    System.out.print("enter the years of exprience");
    int exprience = scan.nextInt();
    Employee_Address(name,salary,exprience);
   int Salary_Hra = Hra(salary);
   System.out.println("HRA:"+Salary_Hra);
    int Salary_Da = Da(salary);
   System.out.println("DA:"+Salary_Da);
    int salary_bonus =bonus(exprience, salary);
    System.out.println("bonus:"+salary_bonus);
    int total_grass = grass_salary(salary,Salary_Hra,Salary_Da,salary_bonus);
    System.out.println("total grass :"+total_grass);
    scan.close();
   }
}