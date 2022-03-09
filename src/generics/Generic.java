package generics;

/**
 * 泛型类，实例化泛型类时，必须指定T的 具体类型
 *  T:类型 E：Element
 *  K、V : key、value
 * @param <T>
 */
public class Generic <T>{
    private T key;

    //构造方法，传入参数T
    public Generic(T key){
        this.key = key;
    }

    //返回T
    public T getKey(){
        return key;
    }

    public static void main(String[] args) {
        //如何实例化泛型类
        //一旦指定了T，后边的类型需要符合
        Generic<Integer> integerGeneric = new Generic<Integer>(456);
        System.out.println(integerGeneric.getKey());

        Integer[] intArray = {4,3,1,54,42,13};
        String[] strArray = {"110.1","43543"};
        printArray(intArray);
        System.out.println();
        printArray(strArray);
    }

    /**
     * 泛型方法
     */
    public static <E> void printArray(E[] array){
        for(E e:array){
            System.out.print(e+" ");
        }
    }
}
