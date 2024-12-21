package MultiSorting;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();

        int[] arr = new int[arrSize];
        for(int i=0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        var s1 = new Sort(new MergeSort());
        s1.executeSorting(arr);

        s1 = new Sort(new BubbleSort());
        s1.executeSorting(arr);

        s1 = new Sort(new QuickSort());
        s1.executeSorting(arr);

        s1 = new Sort(new InsertionSort());
        s1.executeSorting(arr);

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));

    }
}
