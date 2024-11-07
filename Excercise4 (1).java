package Practice.Asignment6;

import java.util.Arrays;

public class Excercise4 {

    public static void main(String[] args) {
        int[] arr = {3, 7, 10, 2, 9};

        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
