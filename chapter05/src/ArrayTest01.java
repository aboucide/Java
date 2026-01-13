/**
 * ClassName: ArrayTest01
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author ZhongYuan Cao
 * @Create 2026/1/12 17:25
 * @Version 1.0
 */
public class ArrayTest01 {
    public static void main(String[] args){
        int[] QQnumb = {1,2,1,5,3,2,5,6,3,9};

        for (int i=0; i<QQnumb.length ;i++){
            System.out.println(QQnumb[i]);
        }
        QQnumb[0]=66666;
        System.out.println(QQnumb[0]);

        String[] name = {"王","多鱼"};
        String[] sex;
        sex = new String[]{"男", "女"};
        System.out.println(sex[0]);

    }
}
