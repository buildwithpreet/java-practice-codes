package Arrays;

import java.util.Scanner;

public class Pairs_in_Arrays {
    public static void printPairs(int Numbers[]){
        int j;
        int i;
        for ( i=0;i<Numbers.length;i++){
            int curr = Numbers[i];

            for(j=i+1 ; j<Numbers.length ; j++){
            System.out.print("("+curr + ","+Numbers[j]+")");
        }
         System.out.println();}

}
       public  static void main(String args[]){
        int Numbers []= {2,4,6,8,10};
        printPairs(Numbers);

       }
}
