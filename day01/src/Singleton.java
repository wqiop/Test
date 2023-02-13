/**
 * @author zqj
 * @date 2022/9/8
 */
public class Singleton {
    private Singleton(){}
    private volatile static Singleton singleton = null;
    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
