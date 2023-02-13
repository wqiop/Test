/**
 * @author zqj
 * @date 2022/9/8
 */
public class A {
    public void a(){
        System.out.println("a");
    }

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        A a = new A();
        B b = new B();
        a.a();
        b.a();
        a = b;
        b = (B) a;
        a.a();
        b.a();
        System.out.println(null == null);
    }
}


