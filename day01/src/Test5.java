/**
 * @author zqj
 * @date 2022/9/4
 */
public class Test5 {
    public static void main(String[] args) {
        int i = 9;
        switch (i++){
            case 9:
                i+=2;
                break;
            case 10:
                i+=3;
                break;
            default:i++;
        }
        System.out.println(i++);
    }
}
