/**
 * 练习使用Scanner来让用户输入。
 */


package chapter03;
import java.util.Scanner;

public class Excise01 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的求婚条件");
        System.out.print("请输入你的身高(单位:cm): ");
        int height = scan.nextInt();
        System.out.println("你的身高: "+ height +"cm");
        System.out.print("请输入你的财富(单位:w): ");
        int wealth = scan.nextInt();
        System.out.println("你的财富: "+ wealth + "万");
        System.out.print("请问你是帅哥吗？(是/不是): ");
        String handsomeGuy = scan.next();
        System.out.println("你" + handsomeGuy +"帅哥");

        boolean first = height>180;
        boolean second = wealth>1000;
        boolean third = handsomeGuy.equals("是");

        if(first && second && third){
            System.out.println("我一定要嫁给他！！！");
        }
        else if(first|| second|| third){
            System.out.println("嫁吧，比上不足，比下有余。");
        }
        else{
            System.out.println("不嫁！");
        }
        scan.close();
    }
}
