package Practice.Asignment6;

import java.util.Scanner;

public class Excercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to count: ");
        int elementToCount = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elementToCount) {
                count++;
            }
        }

        System.out.println("Occurrences of " + elementToCount + ": " + count);
    }
}
