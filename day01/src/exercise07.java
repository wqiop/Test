import java.util.Scanner;

public class exercise07 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入a的值：");
        int a1 = s.nextInt();
        System.out.print("请输入项数：");
        int a2 = s.nextInt();
        int sum=0,num=0;

        for(int i=1;i<=a2;i++)
        {
            if(i==1)
            {
                sum=a1;
                num=a1;
            }
            else
            {
                num=num*10+a1;
                sum=sum+num;
            }
        }
        System.out.println("结果是："+sum);
    }
}
