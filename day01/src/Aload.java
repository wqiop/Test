/**
 * @author zqj
 * @date 2022/9/4
 */
public class Aload {
    static {
        System.out.println("Aload");
    }

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class clazz = classLoader.loadClass("com.topic1.Aload");
        System.out.print("TestLoad");
        Class.forName("com.topic1.Aload");
    }
}
