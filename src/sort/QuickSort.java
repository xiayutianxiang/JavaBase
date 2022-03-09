package sort;

import java.util.Random;

public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        int i,j;
        if(low>=high){
            return;
        }
        i=low;
        j=high;
        int temp=arr[low];  //当前基位
        while (i<j){
            while (temp<=arr[j] && i<j){
                j--;
            }
            while (temp>=arr[i] && i<j){
                i++;
            }
            if(i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[low]=arr[i];
        arr[i]=temp;
        quickSort(arr,low,j-1);
        quickSort(arr,j+1,high);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[400];
        for(int i=0;i<400;i++){
            int cur = random.nextInt(9999);
            arr[i]=cur;
        }
        quickSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
