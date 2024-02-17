package org.example;
import java.lang.Math;
public class Calculator {
    // public static int add(int a,int b){
    //     return a+b;
    // }
    public static double sqRoot(double x){
        if (x < 0) {
            throw new IllegalArgumentException("Square root of a negative number is undefined");
        }
        return Math.sqrt(x);
    }
    public static int factorial(int x){
        if (x < 0) {
            throw new IllegalArgumentException("Factorial of a negative number is undefined");
        }
        if (x == 0 || x == 1) {
            return 1;
        }
        int ans = 1;
        for(int i=1;i<=x;i++){
            ans *=i;
        }
        return ans;
    }

    public static double naturalLog(double x){
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is undefined for non-positive numbers");
        }
        return Math.log(x);
    }
    public static double power(double x,double b){
        if (x < 0 && b % 1 != 0) {
            throw new IllegalArgumentException("Cannot raise negative base to a non-integer exponent");
        }
        return Math.pow(x,b);
    }
}
