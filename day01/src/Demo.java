import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author zqj
 * @date 2022/9/10
 */
public class Demo {
    public static void main(String[] args) {
        int b [][] = {{1},{2,2},{2,2,2}};
        int sum = 0;
        for (int i = 0; i <b.length ; i++) {
            for (int j = 0;j<b[i].length;j++){
                sum+=b[i][j];
            }
        }
        System.out.println(sum);

    }
}
