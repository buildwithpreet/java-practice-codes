package Arrays;

public class linear_search {

        // Function for Linear Search
        public static int linearSearch(int[] arr, int key) {
            for (int i = 0; i < arr.length; i++) {   // loop through array
                if (arr[i] == key) {                // check element
                    return i;                       // index found
                }
            }
            return -1;  // element not found
        }

        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            int key = 30;

            int result = linearSearch(numbers, key);

            if (result == -1) {
                System.out.println("Element not found in array.");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }
    }
