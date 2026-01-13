package chapter03;
/**
 * 输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
 * 例如： `153 = 1*1*1 + 3*3*3 + 5*5*5`
 */
public class Excise06 {
    public static void main(String args[]){
        for(int i=100; i<1000 ;i++){
            int a = i%10;//取个位数字
            int b = i/10%10;//取十位数字
            int c = i/10/10;//取百位数字

            if(a*a*a + b*b*b + c*c*c == i){
                System.out.println(i+"是水仙花数:");
            }
        }
    }
}
