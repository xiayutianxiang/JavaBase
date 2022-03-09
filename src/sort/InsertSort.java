package sort;

public class InsertSort {
    public static void insertSort(int[] arr){
        /*for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=temp;
        }*/
        int temp;
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            int j;
            for (j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args) {
        int[] t = {1,2,3,5,4,8,6};
        int[] arr = {5,1,4,3,2,8,6,7};
        /**
         *  {1,5,4,3,2,8,6,7} ---> {1,4,5,3,2,8,6,7}
         */
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
