package com.demo;

    import java.util.Scanner;

    public class FactorialExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            scanner.close();
            int factorial = calculateFactorial(n);
            System.out.println("The factorial of " + n + " is " + factorial);
        }

        private static int calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * calculateFactorial(n - 1);
        }
    }
