package generics;

/**
 * 继承泛型接口不指定类型
 * @param <T>
 */
public class GenericImpl<T> implements Generics<T>{
    @Override
    public T method() {
        return null;
    }

    /**
     * 继承泛型接口指定泛型接口
     */
    public class GenericImpl2 implements Generics<String>{
        @Override
        public String method() {
            return null;
        }
    }
}
