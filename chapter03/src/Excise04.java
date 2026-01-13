/**
 * 押宝游戏
 * 随机产生3个1-6的整数，如果三个数相等，那么称为“豹子”，
 * 如果三个数之和大于9，称为“大”，如果三个数之和小于等于9，称为“小”，
 * 用户从键盘输入押的是“豹子”、“大”、“小”，并判断是否猜对了。
 */

package chapter03;
import java.util.Scanner;


public class Excise04 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("押宝游戏:请你输入押的是“豹子”、“大”、“小” ");
        String ans = scan.next();

        int a = (int) (Math.random()*6 +1);
        int b = (int) (Math.random()*6 +1);
        int c = (int) (Math.random()*6 +1);

        System.out.println("第一个点数：" +a+"\n第二个点数"+b+"\n第三个点数"+c);
        String right;
        if(a==b && b==c){
            right = "豹子";
            System.out.println("庄家为：“豹子”");
        }
        else{
            if(a+b+c>9){
            right = "大";
            System.out.println("庄家为：“大”");

            }
            else{
                right = "小";
                System.out.println("庄家为：“小” ");

            }
        }
        

        if(ans.equals(right)){
            System.out.println("恭喜中奖了你答对了");
        }
        else{
            System.out.println("很遗憾你输了");
        }
        scan.close();
    }    
    
}
