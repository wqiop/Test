/**
 * @date 2022/10/18
 * @author zqj
 */

/**
 * @author: zqj2873515118
 * @create: 2022-10-18 09:10
 **/
public class Test22 {
    public static void main(String[] args) {
        System.out.println(0100);
        /*
         * 0xA A表示十六进制的10，转化为二进制就是1010
         * 3   十进制的三，转化为二进制就是11
         * 两者进行或运算
         * 1010
         * 0011
         * ----
         * 1011   然后将二进制的1011转化为十进制为1+2+8=11
         * 0010
         * @param args
         * @return
         **/
        System.out.println(0xA | 3);
        System.out.println(0xA & 3);
    }
}
