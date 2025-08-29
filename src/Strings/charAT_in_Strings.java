package Strings;

public class charAT_in_Strings {
    public static void printCharAt(String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        String s1 = new String("PREET");
        String s2 = new String("DHAKAD");
        String fullname = s1+" "+s2;
        printCharAt(fullname);
    }
    
}
