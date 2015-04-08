package ArraySort;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        int start = 0;
        int min;
        int temp;
        for (int k = start; k < (array.length - 1); k++) {
            min = k;
            for (int l = (start + 1); l < array.length; l++) {
                if (array[l] < array[min]) min = l;
            }
            temp = array[k];
            array[k] = array[min];
            array[min] = temp;
            start++;
        }
        for (int m = 0; m < array.length; m++) {
            System.out.print(array[m] + " ");
        }
    }
}
