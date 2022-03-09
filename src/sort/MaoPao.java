package sort;

/**
 * 冒泡排序，每次比较相邻的两个数，把大的移到右边去。
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {12,3,5,22,5,45,3,15,8,357,1,2,89456,46,88613,48,45,3,654223,64,31,3,432,31};
        MaoPao.MaoPao(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * 比如 【54，453，534，231，54，9，69，32】
     * 从第一趟开始，比较第一个和第二个数，把大的移到第二个位置上，再接着比较第二个和第三个。。这样一次下来，最后一个数就是最大的
     *      下一次就可以比较除了上一趟排序完后最后面的数字了。比如开始有6个数字，第一次排完后，下次只需要比较前5个数字
     *                                                                  第二次排完后，下次比较前4个数字
     *                                                                   第k次排完后 ，下次比较前n-k个数字(k<n,剩下最后一个数肯定是最小的)
     *  比较过程中需要注意数组越界。
     * @param arr
     */
    private static void MaoPao(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
