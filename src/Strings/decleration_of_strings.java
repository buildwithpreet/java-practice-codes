package Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class decleration_of_strings {
    public static void main(String[] args) {
        char arr []={'a','b','c','d'};
        String s1 = "abc";                         //method 1
        String s2 = new String("abd");     //method 2
        //System.out.println(s2);

        //in java strings are IMMUTABLE

        // input of string in java
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

    }
}
