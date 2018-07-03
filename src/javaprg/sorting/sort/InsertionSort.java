package javaprg.sorting.sort;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int arr[] = {5,1,7,2,9,4};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr)
    {
        insertionSort(arr,0);
    }

    private static void insertionSort(int[] arr, int i)
    {
        if(i>=arr.length) {
            return;
        }
        insertionSort(arr, (i+1));
        findCorrectPlaceAndreplace(arr,i);
    }

    private static void findCorrectPlaceAndreplace(int[] arr, int i)
    {
        
        
    }
}
