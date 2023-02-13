/**
 * @author zqj
 * @date 2022/9/12
 */
public class Demo4 {
    public static void main(String[] args) {
        int x= 3;
        int y = 1;
        if(x==y){ //若是x=y 编译时异常   if()括号中必须是boolean类型
            System.out.println("not");
        }else {
            System.out.println("yes");
        }
    }
}
