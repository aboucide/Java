package chapter03;


/**
 * 遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
 */
public class Excise05 {
    public static void main(String args[]){
        int count = 0;
        int total = 0;

        for(int i=1; i<=100 ;i++){
            if(i%2==0){
                count +=1;
                total +=i;
                System.out.println(i+"是偶数；这是第"+count+"个偶数");
            }
        }
        System.out.println("1~100,偶数共计"+count+"个");
        System.out.println("1~100偶数之和为:"+total);

    }
}
