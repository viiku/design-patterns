package MultiSorting;

public class Sort {

    // Object of interface
    private SortingContext sortingContext;

    // this is known as constructor injection
    public Sort(SortingContext sortingContext) {
        this.sortingContext = sortingContext;
    }

    public void changeSortingMethod(SortingContext sortingContext) {
        this.sortingContext = sortingContext;
    }

    public void executeSorting(int[] arr) {
        sortingContext.sort(arr);
    }
}
