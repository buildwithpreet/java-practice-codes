package Strings;

public class checking_palindrome {
    public static boolean ispalindrome(String str){
        int n = str.length();
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i) == str.charAt(n-i-1)){
                return true;
            }

        }
        return false;
    }


    public static void main (String []args){
        String name = "noon";
        System.out.println(ispalindrome(name));

    }
}
