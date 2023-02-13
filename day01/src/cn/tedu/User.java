package cn.tedu;/**
 * @date 2023/2/5
 * @author zqj
 */

/**
 * @ClassName User
 * @Description
 * @Author zqj2873515118
 * @Date 2023/2/5 19:31
 * @Version 1.0
 */
public class User {
    public static Cat cat =new Cat();
    public static void main(String[] args) {
        cat.eat();
    }
    private User(){};
    private static User user =new User();
    public static User getUser(){
        return user;
    }
}
