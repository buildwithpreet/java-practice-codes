package functions;

import java.util.Scanner;

public class checkingprime{
    public static boolean checkPrime(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main (String[] args){
        boolean check = checkPrime();
        System.out.println(check);

    }



}
