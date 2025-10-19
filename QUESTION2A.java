package question2a;

import java.util.Scanner;

public class QUESTION2A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double rate = 0.05; 
        
        System.out.print("Enter number of teachers: ");
        int n = input.nextInt();
        
        System.out.print("Enter time period in years: ");
        int time = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("\nTeacher " + i + ":");
            System.out.print("Enter principal amount: ");
            double principal = input.nextDouble();
            
            double value = principal + (principal * rate * time);
            System.out.println("Value after " + time + " years = " + value);
        }
    }
}
