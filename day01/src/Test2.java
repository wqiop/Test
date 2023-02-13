/**
 * @author zqj
 * @date 2022/9/4
 */
public class Test2 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a,b);
        System.out.println(a+","+b);
    }

    private static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y=x;
    }
}
