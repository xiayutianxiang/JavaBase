package generics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * java 泛型
 */
public class Demo1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(5);

        //list.add('a');    出错
        Class<? extends List> aClass = list.getClass();

        Method add = aClass.getDeclaredMethod("add", Object.class);
        add.invoke(list, "kl");
        System.out.println(list);

    }
}
