package src;

/**
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：

例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1

 * @author: caozhongyuan
 * @date: 2025年12月29日
 */

public class Excise02{
    public static void main(String a[]){
        int num1=532;
        System.out.println("它的个位数为："+num1%10%10);
        
        System.out.println("它的十位数为："+num1/10%10);

        System.out.println("它的百位数为："+num1/100);
    }
}
