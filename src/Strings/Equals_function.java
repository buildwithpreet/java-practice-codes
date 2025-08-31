package Strings;

public class Equals_function {
    public static void main (String []args){
        String s1 = "noon";
        String s2 = "noon";
        String s3 = new String("noon");
        if (s1.equals(s3)){                            //function to equalize simple string decleration s1 and using new keyword string decleration.
            System.out.println("same object");
        }
        else {
            System.out.println("different object");
        }
    }
}
