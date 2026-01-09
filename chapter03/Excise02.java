/**
从键盘分别输入年、月、日，判断这一天是当年的第几天
 
注：判断一年是否是闰年的标准：
   1）可以被4整除，但不可被100整除
	  或
   2）可以被400整除
   
例如：1900，2200等能被4整除，但同时能被100整除，但不能被400整除，不是闰年 
闰年的2月份是29天；平年的2月份是28天。  所以闰年是一年366天。

闰年规则简记：四润百不润，四百又润。能被 4 整除且不能被 100 整除，或者能被 400 整除的年份就是闰年。
*/

package chapter03;
import java.util.Scanner;

public class Excise02 {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        System.out.println("从键盘分别输入年、月、日，判断这一天是当年的第几天");
        System.out.print("请输入年：");
        int year = scan.nextInt();
        
        System.out.print("请输入月：");
        int month = scan.nextInt();
        
        System.out.print("请输入日：");
        int day = scan.nextInt();

        int daysOfFeb = 29; //创建2月的天数 变量
        int totalDay = 0 ; //创建天总数
                
        if (month < 1 || month > 12) {
            System.out.println("❌ 月份输入错误！请输入1~12之间的数字");
            scan.close();
            return; // 终止程序，避免错误计算
        }
        if (day < 1 || day>31) {
            System.out.println("❌ 日期输入错误！");
            scan.close();
            return;
        }

        //判断是否为闰年
        if( (year%4==0 && year%100!=0) || (year%400==0) ){
            System.out.println(year+"年是闰年,2月有29天");
        }
        else{
            System.out.println(year+"年是平年,2月有28天");
            daysOfFeb = 28;
        }

        switch (month - 1) {
            case 11:
                totalDay +=30;

            case 10:
                totalDay +=31;

            case 9:
                totalDay +=30;

            case 8:
                totalDay +=31;

            case 7:
                totalDay +=31;

            case 6:
                totalDay +=30;

            case 5:
                totalDay +=31;

            case 4:
                totalDay +=30;

            case 3:
                totalDay +=31;

            case 2:
                totalDay +=daysOfFeb;

            case 1:
                totalDay +=31;
                break;
            case 0:
                break;
            default:
                System.out.print("您输入的月份有误,范围1~12月");
                break;
        }

        totalDay += day;

        System.out.println("您输入的日期为:"+year+"年"+month+"月"+day+"日\n"+"为当年的第【"+totalDay+"】天");
        scan.close();
    }
}
