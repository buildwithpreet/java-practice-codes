package Arrays;

public class linear_search_using_functions {
    public static int linearSearch(int number[], int key) {
        for(int i=0;i<number.length;i++){
            if (number[i]==key) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10,12,14,16,18};
        int key = 12;
        int index = linearSearch(number,key);

        if(index==-1){
            System.out.println("NOT FOUND");

        } else
            System.out.println("the key is at index"+index);

    }
}
