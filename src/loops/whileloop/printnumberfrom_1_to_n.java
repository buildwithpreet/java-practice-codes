package loops.whileloop;

import java.util.Scanner;

public class printnumberfrom_1_to_n {
    public static void main(String[] args) {
        int num=1;
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        while(num<=n){
            System.out.print(num+" ");
            num++;


        }
    }
}
