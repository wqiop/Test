import sun.font.TrueTypeFont;

/**
 * @author zqj
 * @date 2022/4/20
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }
    private static boolean isAdmin(String admin) {
        return admin.toLowerCase()=="admin";
    }
}
