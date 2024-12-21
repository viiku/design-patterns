package Sorting;

public class Main {
    
    public static void main(String[] args) {
        var s1 = new Sort(new MergeSort());
        s1.executeSorting();

        s1 = new Sort(new BubbleSort());
        s1.executeSorting();

        s1 = new Sort(new QuickSort());
        s1.executeSorting();

        s1 = new Sort(new InsertionSort());
        s1.executeSorting();

    }
}
