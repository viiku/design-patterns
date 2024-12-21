package MultiSorting;

public class MergeSort implements SortingContext{
    public void sort(int[] arr) {
        System.out.println("Applying Merge Sort....\n");
        int n = arr.length;
        mergesort(arr,0,n-1);
        System.out.println("Merge Sort Applied");
    }

    public void merge(int a[],int left,int mid,int right){
        int i=left,j=mid+1,k=0;
        int temp[] = new int[right-left+1];
        while(i<=mid && j<=right){
            if(a[i]<=a[j]){
                temp[k]=a[i];
                k++;i++;
            }else{
                temp[k]=a[j];
                j++;k++;
            }
        }
        while(i<=mid){
            temp[k]=a[i];
            i++;k++;
        }
        while(j<=right){
            temp[k]=a[j];
            j++;k++;
        }
        for(int index=left;index<=right;index++){
            a[index]=temp[index-left];
        }
    };

    public void mergesort(int a[],int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergesort(a,l,mid);
        mergesort(a,mid+1,r);
        merge(a,l,mid,r);
        // System.out.println("Sorted array: " + java.util.Arrays.toString(a));
    }
}
