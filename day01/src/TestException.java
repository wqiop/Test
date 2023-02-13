/**
 * @author zqj
 * @date 2022/9/4
 */
public class TestException {
    public static void main(String[] args) {
        try {
            try {
                throw new B1();
            }catch (A1 a){
                System.out.print("Caught A ");
                throw a;
            }
        }catch (B1 b){
            System.out.print("Caught B ");
        }finally {
            System.out.println("finally");
        }
    }
}
class A1 extends Exception{}
class B1 extends A1{}
