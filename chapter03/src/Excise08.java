package chapter03;
/**
说明：输入两个正整数m和n，求其最大公约数和最小公倍数。

比如：12和20的最大公约数是4，最小公倍数是60。 
*/
import java.util.Scanner;

public class Excise08 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.printf("请输入两个数,我将帮你计算他们的最小公倍数和最大公约数\n");

        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("错误：请输入大于0的正整数！");
            scan.close();
            return; // 终止程序
        }
        int leastCommonMultiple = 0;    //最小公倍数
        int greatestCommonDivisor = 0;  //最大公约数

        for(int i=1; i<=(a<b?a:b) ;i++){
            if(a%i==0 && b%i==0){
                greatestCommonDivisor = i;
            }
        }
            System.out.printf("他们的最大公约数为： %d \n",greatestCommonDivisor);


        for(int j=1;;j++){
            if(j%a==0 && j%b==0){
                leastCommonMultiple = j;
                System.out.printf("他们的最小公倍数为： %d\n",leastCommonMultiple);
                break;
            }
        }

        //计算最小公倍数（用公式：最小公倍数 = 两数乘积 / 最大公约数，效率极高）
        scan.close();
    }    
}
