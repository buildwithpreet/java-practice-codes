package functions;

import java.util.Scanner;
//without parameter
public class calculatesum {
    public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {      //main function ke andar hamesha void likhna hota hia in java
        calculatesum();
    }

}

