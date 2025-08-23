package Arrays;

public class finding_largest_no_in_arrays {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;    // denoted as -INFINITY in java it is pakage of java
        for(int i=0;i<number.length;i++){
            if (largest<number[i]){
                largest = number[i];

            }
        }       return largest;
    }
    public static void main(String args[]){
        int number[] = {2,4,8,3,1,5};
        System.out.print("LARGEST NUMBE IS:"+getLargest(number));


    }

}
