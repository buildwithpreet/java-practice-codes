package functions;

import java.util.Scanner;
public class calculatefactorial {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }

public static void main (String args[]){
        int fac = factorial(4);
       System.out.println(fac);
}

}
