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
public class newComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("please insert your monitor size 38 or 43 only");
        int monitor = input.nextInt();
        
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        int disc = input.nextInt();
        
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int printer = input.nextInt();
        
        double addDisc = 65.99;
        String addD = "* DVD-ROM >>> 65.99$";
        
        double addPrinter = 125.00;
        String addP = "* Printer >>> 125.00$";
        
        switch (monitor) {
            
            case 38:
                switch (disc) {
                    case 1:
                        switch (printer) {
                            case 1:
                                
                                System.out.println("======= Your order =======");
                                System.out.println("* computer >>> 375.99$");
                                System.out.println("* 38'Monitor >>> 75.99$" + "\n" + addD + "\n" + addP);
                                System.out.println("======= Total price >>> " + (3));
                        }
                }
            case 43:
        }
    }
}
