package chapter03;
import java.util.Scanner;
public class input {
    
    public static void main(String args[]){
        
    Scanner scan = new Scanner(System.in);

        System.out.print("请输入姓名:");
        String name = scan.next();
        System.out.print("姓名:"+name);

        scan.close();
    }    
}
