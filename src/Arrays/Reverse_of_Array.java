package Arrays;

public class Reverse_of_Array {
    public static void Reverse(int Numbers[]){  //int Number[] is array
        int first=0;
        int last=Numbers.length-1;

        //condition to flow of code and logic

        while(first<last){                  //ye loop tbb tk chalega jbb tkk first<last
            int temp=Numbers[first];
             Numbers[first] = Numbers [last];
             Numbers[last]=temp;
             first++;                          //har bar indexing value ek se increase hogi agge se
             last--;                           //har bar indexing value decrease hogi piche se

        }
    }
    //    function calling
    public static void main(String[] args) {
        int Numbers[] = {40,80,120,200,800};
        Reverse(Numbers);
        for(int i=0;i<Numbers.length;i++){    //ye loop dekho dhyan se indexing value of array define kr rha hai
            System.out.print(Numbers[i]+" ");


        }



    }
}
