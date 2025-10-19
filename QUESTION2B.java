package question2b;

import java.util.Scanner;

public class QUESTION2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter object distance (u) in cm: ");
        double u = scanner.nextDouble();
        if (u > 0) {
            u = -u; 
        }
        
        System.out.print("Enter image distance (v) in cm: ");
        double v = scanner.nextDouble();
        
        double f = 1 / ((1 / v) + (1 / u));
       
        System.out.printf("Focal length (f) = %.2f cm%n", f);
        
        if (f >= 21.0 && f <= 25.0) {
            System.out.println("The mirror is acceptable.");
        } else {
            System.out.println("The mirror is not acceptable.");
        }
        
        scanner.close();
    }
}