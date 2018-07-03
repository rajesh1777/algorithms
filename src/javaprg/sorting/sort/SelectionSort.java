package javaprg.sorting.sort;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int arr[] = {3,4,6,1,2,9,8,5,7};
        selectSort(arr);
        
        for (int i : arr)
        {
            System.out.println(i);
        }
    }

    private static void selectSort(int[] arr)
    {
        selectSort(arr, 0);
        
    }

    private static void selectSort(int[] arr, int i)
    {
        if(i >= arr.length) {
            return;
        }
        findMin(arr, i);      
        selectSort(arr, (i+1));  
    }

    private static void findMin(int[] arr, int i)
    {
        int min = arr[i];
        int ind = i;
        for(int j=(i+1); j < arr.length; j++) {
            if(min > arr[j]) {
                min = arr[j];
                ind = j;
            }
        }
        swap(arr,i, min, ind);
    }

    private static void swap(int arr[], int i, int min, int j)
    {
        int temp = arr[i];
        arr[i] = min;
        arr[j] = temp;
    }
    
    
}
