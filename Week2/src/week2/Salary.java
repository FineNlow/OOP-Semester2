/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please insert your name : ");
        String name = input.nextLine();
        
        System.out.print("Please insert your age : ");
        int age = input.nextInt();
        
        System.out.print("Please insert number of working days : ");
        double work = input.nextDouble();
        
        System.out.print("Please insert number of absent days : ");
        double absent = input.nextDouble();
        
        System.out.print("Please insert your body weight : ");
        double weight = input.nextDouble();
        
        System.out.println("Hi, " + name);
        
        if ((weight >= 10) && (weight < 61)) {
            
            if ((age >= 21) && (age <= 31)) {
                
                double salary;
                salary = (work * 300) - (absent * 50);
                System.out.println("Your salary is " + salary + " Bath" + "\n" + "Your salary and bonus is " + (salary + 5000) + " Bath");
                
            } else if ((age  >= 31) && (age <= 40)) {
                
                double salary;
                salary = (work * 500) - (absent * 50);
                System.out.println("Your salary is " + salary + " Bath" + "\n" + "Your salary and bonus is " + (salary + 5000) + " Bath");
                
            } else if ((age >= 41) && (age <= 50)) {
                
                double salary;
                salary = (work * 1000) - (absent * 25);
                System.out.println("Your salary is " + salary + " Bath" + "\n" + "Your salary and bonus is " + (salary + 5000) + " Bath");
                
            } else if ((age >= 51) && (age <= 60)) {
                
                double salary;
                salary = (work * 3000);
                System.out.println("Your salary is " + salary + " Bath" + "\n" + "Your salary and bonus is " + (salary + 5000) + " Bath");
                
            }
    
        } else if ((weight >= 61) && (weight <= 90)) {
            
            if ((age >= 21) && (age <= 31)) {
                
                double salary;
                salary = (work * 300) - (absent * 50);
                System.out.println("Your salary is " + salary + " Bath" + "\n" + "Your salary and bonus is " + (salary + (5000 - ((weight - 60) * 10))) + " Bath");
                
            } else if ((age  >= 31) && (age <= 40)) {
                
                double salary;
                salary = (work * 500) - (absent * 50);
                System.out.println("Your salary is " + salary + " Bath" + "\n" + "Your salary and bonus is " + (salary + (5000 - ((weight - 60) * 10))) + " Bath");
                
            } else if ((age >= 41) && (age <= 50)) {
                
                double salary = (work * 1000) - (absent * 25);
                salary = (work * 1000) - (absent * 25);
                System.out.println("Your salary is " + salary + " Bath" + "\n" + "Your salary and bonus is " + (salary + (5000 - ((weight - 60) * 10))) + " Bath");
                
            } else if ((age >= 51) && (age <= 60)) {
                
                double salary;
                salary = (work * 3000);
                System.out.println("Your salary is " + salary + " Bath" + "\n" + "Your salary and bonus is " + (salary + (5000 - ((weight - 60) * 10))) + " Bath");
                
            }
        } else if (weight > 90) {
            
            if ((age >= 21) && (age <= 31)) {
                
                double salary;
                salary = (work * 300) - (absent * 50);
                System.out.println("Your salary is " + salary + " Bath");
                
            } else if ((age  >= 31) && (age <= 40)) {
                
                double salary;
                salary = (work * 500) - (absent * 50);
                System.out.println("Your salary is " + salary + " Bath");
                
            } else if ((age >= 41) && (age <= 50)) {
                
                double salary;
                salary = (work * 1000) - (absent * 25);
                System.out.println("Your salary is " + salary + " Bath");
                
            } else if ((age >= 51) && (age <= 60)) {
                
                double salary;
                salary = (work * 3000);
                System.out.println("Your salary is " + salary + " Bath");
                
        } else {
                System.out.println("Wrong weight input");
            }
    
        }
    }
}
