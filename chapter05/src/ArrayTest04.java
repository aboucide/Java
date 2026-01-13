/**
 * ClassName: ArrayTest04
 * Package: PACKAGE_NAME
 * Description:使用二维数组打印一个 10 行杨辉三角。
 * 提示：
 * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 * 2. 每一行的第一个元素和最后一个元素都是 1
 * 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。
 * 符合 yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 * @Author ZhongYuan Cao
 * @Create 2026/1/14 0:00
 * @Version 1.0
 */
public class ArrayTest04 {
    public static void main(String[] args){
        int[][] arr = new int[10][] ;
        for(int i=0; i<10 ;i++){
            arr[i] = new int[i+1];
            arr[i][0] = 1;
            arr[i][i] = 1;

            for(int j=1; i>=2 && j<arr[i].length -1 ;j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        for(int[] row:arr){
            for(int num:row){
                System.out.print(num);
            }
            System.out.print("\n");

        }

    }

}
