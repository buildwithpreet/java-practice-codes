package functions;

import java.util.Scanner;

public class ratioof2numbers {
    public static float ratio(){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float ratio = (float)(a/b);
        return ratio;


    } public static void main(String[] args) {
        System.out.println(ratio());


    }
}
