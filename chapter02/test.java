public class test {
    public static void main(String a[]){
        int i = 2;
        int j = i++;
        System.out.println(j);  //2

        int m = 2;
        m = m++; //(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
        System.out.println(m); //2
    }
}
