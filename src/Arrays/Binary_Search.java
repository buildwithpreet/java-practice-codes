package Arrays;

import java.util.Scanner;

import java.util.Scanner;

public class  Binary_Search {
    // Function for Binary Search
    public static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // key mil gayi, index return
            } else if (arr[mid] < key) {
                low = mid + 1; // right side search
            } else {
                high = mid - 1; // left side search
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50, 60};
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}





