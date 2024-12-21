package MultiSorting;

// import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);
        // int arrSize = scanner.nextInt();

        // int[] arr = new int[arrSize];
        // for(int i=0; i < arrSize; i++) {
        //     arr[i] = scanner.nextInt();
        // }

        // scanner.close();
        int arr[] = new int[]{5, 2, 9, 1, 5, 6};
        var s1 = new Sort(new BubbleSort());
        s1.executeSorting(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));

        // s1 = new Sort(new MergeSort());
        arr = new int[]{5, 2, 9, 1, 5, 6};
        s1.changeSortingMethod(new MergeSort());
        s1.executeSorting(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));

        // s1 = new Sort(new QuickSort());
        arr = new int[]{5, 2, 9, 1, 5, 6};
        s1.changeSortingMethod(new QuickSort());
        s1.executeSorting(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));

        // s1 = new Sort(new InsertionSort());
        s1.changeSortingMethod(new InsertionSort());
        s1.executeSorting(arr);

        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));

    }
}
