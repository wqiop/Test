/**
 * @author zqj
 * @date 2022/9/4
 */
public class Inc {
    public static void main(String[] args) {
        Inc inc = new Inc();
        int i = 0;
        inc.fermin(i);
        i = i++;
        System.out.println(i);
    }
    void fermin(int i) {
        i++;
    }

}