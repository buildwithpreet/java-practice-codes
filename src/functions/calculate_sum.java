package functions;

import java.util.Scanner;

public class calculate_sum{

    // sum with parameter

    public static int calculate_sum(int a,int b){//a,b are formal  parameters when define
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculate_sum(a,b);      //arguments or actual parameter in main called functions
        System.out.println("sum is:" + sum);

    }

}
