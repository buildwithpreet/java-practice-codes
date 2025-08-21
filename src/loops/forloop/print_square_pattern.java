package loops.forloop;

import java.util.Scanner;

public class print_square_pattern {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("* * * *");
        }
    }
}
