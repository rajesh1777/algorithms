package com.avaya.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAscendingPair
{

    public static void main(String[] args)
    {
        int[] arr = new int[]
        { 2, 1, 3, 1, 4 };
        //find(arr, new ArrayList<>());
        recursive(0,arr);
    }

    static void recursive(int idx,int[] arr)
    {
        if (idx >= arr.length)
        {
            return;
        }
        printArr(Arrays.copyOfRange(arr, idx, arr.length));
        
        recursive(idx + 1, arr);
    }
    
    static void findLIS() {
        
    }
    
    static void findLIS(int arr[], int idx){
        List<Integer> temp = new ArrayList<>();
        temp.add(arr[idx]);
        
        int prev = arr[idx];
        
        
    }

    static void printArr(int arr[])
    {
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void find(int[] arr, List<Integer> list)
    {
        int prev = arr[0];
        list.add(prev);
        for (int i = 1; i < arr.length; i++)
        {
            if (prev < arr[i])
            {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
