/**
 * @author zqj
 * @date 2022/9/4
 */
public class Test3 {

    private volatile boolean isRunning = false;


    public void addI(){
        if(this.isRunning){
            return;
        }
        synchronized (this){
            this.isRunning = true;
        }
        try {
            //
        }finally {
            this.isRunning = false;
        }
    }
}
