package lesson_05_anonymos_inner_class;

import java.lang.reflect.InvocationTargetException;
/**потом
public class MainDoubleAnonymosClassNotStatic {

    DoubleAnonymosClassNotStatic doubleAnonymosClassNotStatic = new DoubleAnonymosClassNotStatic("Cat");
    Comparable<String> comparable1 = null;
    try {
        comparable1 = doubleAnonymosClassNotStatic.comparable.getClass().getDeclaredAnnotation(DoubleAnonymosClassNotStatic.class).newInstance(doubleAnonymosClassNotStatic);
    } catch (InstantiationException |IllegalAccessException | IllegalArgumentException|InvocationTargetException|NoSuchMethodError|
    SecurityException e) {
        e.printStackTrace();
    }
    System.out.println
}
**/