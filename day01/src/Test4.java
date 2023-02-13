/**
 * @author zqj
 * @date 2022/9/4
 */
public class Test4 {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.change(test4.str,test4.ch);
        System.out.print(test4.str+"and");
        System.out.println(test4.ch);
    }
    private void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }
}
