package src;

/**
1. 定义类 CompareLogicExer
2. 定义 main方法
3. 定义一个int类型变量a,变量b,都赋值为20
4. 定义boolean类型变量bo1 , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo1
5. 输出a的值,bo1的值
6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
7. 输出b的值,bo2的值

a++ /3  先使用原始a的值除以3，再进行a=a+1
++a /3  先计算a=a+1,再使用新的a值除以3
&&逻辑运算符，若左边的为真，则继续计算右边的值，若左边为假则右边不需要计算了。

 */
public class CompareLogicExcer{
    public static void main(String a2[]){
        int a,b;
        a=b=20;
        boolean bo1 =((++a%3) == 0 && (a++%7)==0);
        boolean bo2 =((b++ %3)==0 && (++b%7)==0);
        System.out.println("a的值为"+a+"; a是否能被3和7整除:"+bo1);
        System.out.println("b的值为"+b+"; b是否能被3和7整除:"+bo2);
    }
}
