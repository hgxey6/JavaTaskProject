package GrokkingAlgorithms.BinarySearch;

import java.util.Arrays;
//Class Array is static class
public class MethodBinarySearch {
    public static void main(String[] args) {
        int[] array = {45, 12, 45, 32, 87, 13, 89, 100, 555, 1};
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, 13));
    }
}
