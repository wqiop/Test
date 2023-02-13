/**
 * @author zqj
 * @date 2022/9/12
 */
public class Demo2 {
    float fun1(){
        int i = 1;
        return 1;
    }

    public static void main(String[] args) {
        Double x = 1.2;  //Double是包装类型
        long l = (long) 1.2;    //1.2字面量默认为double类型，转为long需要强转
        float f = (float) (x/l);  //需要强转
        System.out.println(f);

    }
}
