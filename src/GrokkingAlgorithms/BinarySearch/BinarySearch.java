package GrokkingAlgorithms.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

// O(log n)
public class BinarySearch {
    private static int binarySearch(int[] array, int key) {
        int value = 0, low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (array[mid] == key) {
                value = mid;
                break;
            } else if (array[mid] > key) high = mid - 1;
            else if (array[mid] < key) low = mid + 1;
        }

        return value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        int[] array = {45, 12, 45, 32, 87, 13, 89, 100, 555, 1};
        Arrays.sort(array);
        System.out.println(binarySearch(array, key));
    }
}
