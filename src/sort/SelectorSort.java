package sort;

public class SelectorSort {
    public static void selectorSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            int min=arr[i];
            int flag=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<min){
                    min=arr[j];
                    flag=j;
                }
            }
            if(flag!=i){
                arr[flag]=arr[i];
                arr[i]=min;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,3,1,6,7,4,8};
        selectorSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
