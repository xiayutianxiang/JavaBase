package tanxin;

public class DevCookie {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,4,5,6,8};
        DevCookie devCookie = new DevCookie();
        int maxChildren = devCookie.findMaxChildren(arr1, arr2);
        System.out.println(maxChildren);
    }

    /**
     * 假设两个数组是递增排列
     * @param child
     * @param cookies
     * @return
     */
    public int findMaxChildren(int[] child,int[] cookies){
        int result=0;
        int c=child.length-1;
        int k=cookies.length-1;
        while (c>=0 && k>=0){   //两个都没有找完
            if(child[c]<=cookies[k]){   //最大胃口<=饼干最大尺寸
                result++;
                c--;
                k--;
            }else {         //最大胃口>饼干最大尺寸,找下一个孩子的胃口
                c--;
            }
        }
        return result;
    }
}
