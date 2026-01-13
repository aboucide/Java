package chapter03;
/**
 * 打印出四位数字中  “个位+百位”  等于  “十位+千位”
 * 并且个位数为偶数，千位数为奇数的数字，并打印符合条件的数字的个数。
 */
public class Excise07 {
    public static void main(String args[]){
        int count = 0;
        for(int i=1000; i<10000  ;i++){   
            int unitsDigit = i%10; //获取个位数字  
            int tenDigit   = i/10%10; //获取十位数字
            int hundredsDigit = i/10/10%10; //获取百位数字
            int thousandthDight = i/10/10/10; //获取千位数字

            if(unitsDigit%2==0 && thousandthDight%2!=0 && unitsDigit + hundredsDigit == tenDigit+thousandthDight){
                count +=1;
                System.out.printf("%d符合要求\n",i);
            }
        }
            System.out.printf("符合要求的数字共有%d个",count);

    }
    
}
