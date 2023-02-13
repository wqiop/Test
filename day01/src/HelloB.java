/**
 * @author zqj
 * @date 2022/9/4
 */
public class HelloB extends HelloA {
    public HelloB() {}
    {
        System.out.println("B class");
    }
    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
class HelloA{
    public HelloA() {}
    {
        System.out.println("A class");
    }
    static {
        System.out.println("static A");
    }
}