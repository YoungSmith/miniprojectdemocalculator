package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int ch  = 0;
        int a,b;
        Scanner sc = new Scanner(System.in);
        while(ch!=5){
            System.out.println("Press 1 to Calculate Square Root\nPress 2 to Calculate Factorial\nPress 3 to Calculate Natural Log\nPress 4 to Calculate Power\nPress 5 to Exit");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter Number");
                    a = sc.nextInt();
                    System.out.println(Calculator.sqRoot(a));
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Enter Number");
                    a = sc.nextInt();
                    System.out.println(Calculator.factorial(a));
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Enter Number");
                    a = sc.nextInt();
                    System.out.println(Calculator.naturalLog(a));
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Enter 1st Number");
                    a = sc.nextInt();
                    System.out.println("Enter 2nd Number");
                    b = sc.nextInt();
                    System.out.println(Calculator.power(a,b));
                    sc.nextLine();
                    break;
                // case 5:
                //     System.out.println("Enter 1st Number");
                //     a = sc.nextInt();
                //     System.out.println("Enter 2nd Number");
                //     b = sc.nextInt();
                //     System.out.println(Calculator.add(a,b));
                //     sc.nextLine();
                //     break;
                case 5:
                    break;
                default:
                    System.out.println("Incorrect Input Try Again");

            }

        }
    }
}
