package functions;

import java.util.Scanner;

public class fullfunctioncode{

    // Addition of two numbers
    public static int add(int a,int b) {
        return a + b;
    }

    // Product of two numbers
    public static int product(int a, int b) {
        return a * b;
    }

    // Swap two numbers (void, just print result)
    public static void swap(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // Factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main function → control flow
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Addition
        /*System.out.print("Enter 2 numbers for addition: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Addition: " + add(x1, y1));

        // Product
        /*System.out.print("Enter 2 numbers for product: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Product: " + product(x2, y2));

        // Swap
        System.out.print("Enter 2 numbers for swap: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        swap(x3, y3);

        // Factorial
        System.out.print("Enter a number for factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial: " + factorial(n));*/


        sc.close();
    }
}
