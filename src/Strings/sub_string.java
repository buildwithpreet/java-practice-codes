package Strings;

public class sub_string {
        public static void main(String[] args) {
            String str = "HelloWorld";

            // Example 1: from index to end
            String s1 = str.substring(5);
            System.out.println(s1);  // Output: World

            // Example 2: between start and end index
            String s2 = str.substring(0, 5);
            System.out.println(s2);  // Output: Hello
        }
    }


