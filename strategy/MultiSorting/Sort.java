package MultiSorting;

public class Sort {

    private SortingContext sortingContext;

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
