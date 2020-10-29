package javaEDU.core;

public class TestTask {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] array = new int[5];

        for (int i = 0; i < array.length; i ++) {
            array[i] = (int) ((101) * Math.random());
        }

        sort.quickSort(array, 0, array.length - 1);

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}


