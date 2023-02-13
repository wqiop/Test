/**
 * @author zqj
 * @date 2022/9/8
 */
public class Test7 {
    public static void main(String[] args) {
        test3();
    }

    private static void test3() {
        try {
            doSomething();
            System.out.println("1");
            doException();
            System.out.println("2");
            return;
        }catch (Exception e){
            System.out.println("3");
        }finally {
            System.out.println("4");
        }
    }

    private static void doException() {
        int i = 1/0;
    }

    private static void doSomething() {
    }


}
