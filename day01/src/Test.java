/**
 * @author zqj
 * @date 2022/6/7
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(0xA & 3);
        eq();
    }
    public static void eq(){
        String s = new String("hello");
        String t = new String("hello");
        char[] c = {'h','e','l','l','o'};
        System.out.println(s.equals(t));//true
        System.out.println(t.equals(c));
        System.out.println(s==t);
        System.out.println(t.equals(new String("hello")));//true



        Integer f1 = 120,f2 = 120,f3 = 138,f4 = 138;
        Integer f5 = new Integer(127),f6 = new Integer(127),
                f7 = new Integer(120);
        System.out.print(f1 == f2);//true
        System.out.print(f3 == f4);//false
        System.out.print(f5 == f6);//false,==对于引用类型，比较的是地址值
        System.out.print(f1 == f7);//false

        Integer i5 = 128 ;  //128已经超出了范围 :new Integer(128)
        Integer i6 = new Integer(128) ;
        System.out.println(i5==i6);
        System.out.println(i5.equals(i6));

    }
}
