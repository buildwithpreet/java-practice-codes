package Arrays;

import java.util.Scanner;

public class creating_array {
    public static void main(String[] args) {
        //creating an array
        int marks[]= new int[100];
        Scanner sc = new Scanner(System.in);

        marks[0]=sc.nextInt();   //physics
        marks[1]=sc.nextInt();   //maths
        marks[2]=sc.nextInt();   //chemistry

        // output of an array
        System.out.println( "physics marks:"+marks[0]);
        System.out.println("maths marks:"+marks[1]);
        System.out.println("chemistry marks:"+marks[2]);

        //update an array
        marks[2]= marks[2]+89;     //marks ko update kr diya
        System.out.println( "chemistry marks:"+marks[2]);    //vapas se chemistry ke marks print krwa diye

        //finding percentage
        System.out.println("percentage is :"+((marks[0]+marks[1]+marks[2])/3)+"%");




    }
}
