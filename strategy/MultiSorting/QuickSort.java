package MultiSorting;

public class QuickSort implements SortingContext{
    public void sort(int[] arr) {
        System.out.println("Applying Quick Sort....\n");
        quickSort(arr, 0, arr.length-1);
        System.out.println("Quick Sort Applied....");
    }

    public void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low -1;
        for(int j=low; j < high; j++) {
            if(arr[j] <= pivot) {
                i+=1;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    public void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
