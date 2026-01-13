/**
 * ClassName: ArrayTest03
 * Package: PACKAGE_NAME
 * Description:获取arr数组中所有元素的和。
 *
 * @Author ZhongYuan Cao
 * @Create 2026/1/13 23:42
 * @Version 1.0
 */
public class ArrayTest03 {
    public static void main(String[] args){
        int[][] arr={
                {3,5,8},
                {12,9},
                {7,0,6,4}
        };

        int total = 0;
        for(int i=0; i<arr.length ;i++){
            for(int j=0; j<arr[i].length ; j++){
                total += arr[i][j];
            }
        }

        System.out.println("元素总和为："+total);
    }
}
