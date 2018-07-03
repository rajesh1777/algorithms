package com.avaya.algo;

import java.util.concurrent.atomic.AtomicInteger;

public class ArrayRunningSume
{
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,2,3,4,7,1,2,3};
        //printRunningSum(0,arr);
        System.out.println(arr.length);
        AtomicInteger inte = new AtomicInteger(0);
        printMinK(arr,0,0,0, 4,inte);
        
        System.out.println(inte.get());
    }

    static void printRunningSum(int idx, int[] arr)
    {   
        if(idx >= arr.length) {
          return;
        }
        System.out.println(sum(arr,idx));
        printRunningSum(idx+1, arr);
    }
    
    static int sum(int[] arr, int end) {
        int sum = 0;
        for (int i = 0; i <= end; i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    
    static void printMinK(int[] arr,int id, int pid,int start, int k,AtomicInteger inte) {
       if(id >= arr.length)
           return ;
       if(arr[id]<=k) {
           printMinK(arr,(id+1),id,start,k,inte);
           if((id-pid)==0) {
               start=id;                   
           }
           System.out.println("start="+ start + " end="+ id + " value=" +  arr[id]);
           inte.addAndGet(((id-start)+1));           
       } else {
           start=id+1;
           printMinK(arr,(id+1),(id+1),start,k,inte);           
       }
    }
    
    

    class KeyIndex {
        private final int start; 
        private final int end;
        public KeyIndex(int start, int end)
        {
            this.start = start;
            this.end = end;
        }
        public int getStart()
        {
            return start;
        }
        public int getEnd()
        {
            return end;
        }
    }
}
