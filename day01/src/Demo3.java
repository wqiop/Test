/**
 * @author zqj
 * @date 2022/9/12
 */
public class Demo3 {
    static int x = 10;
    static {
        x+=5;
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
    static {x/=3;}
}
