package Arrays;

import java.util.Arrays;

public class sub_Arrays {
    public static void printSubArray(int arrays[]) {
        for (int i = 0; i < arrays.length; i++) {
            int start = i;
            for (int j = i; j < arrays.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arrays[k] + " ");

                } System.out.println();
            }
            System.out.println();
        }

    }



    public static void main (String args[]){
        int arrays[]=   {2,4,6,8,10};
                printSubArray(arrays);

    }
}
