/*
 * 需求：指定一个月份，输出该月份对应的季节。一年有四季:
 * 		3,4,5	春季
 * 		6,7,8	夏季
 * 		9,10,11	秋季
 * 		12,1,2	冬季
 */
package chapter03;
import java.util.Scanner;

public class Excise03 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入一个月份(1~12),我可以输出该月份对应的季节");
        int month = scan.nextInt();

        if(month<6 && month>2){
            System.out.println("春季");
        }
        if(month<9 && month>5){
            System.out.println("夏季");
        }
        if(month<12 && month>8){
            System.out.println("秋季");
        }
        else{
            System.out.println("冬季");
        }

        scan.close();
    }    
}
