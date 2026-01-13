import java.util.Scanner;

/**
 * ClassName: ArrayTest02
 * Package: PACKAGE_NAME
 * Description:从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * - 成绩>=最高分-10  等级为’A’
 * - 成绩>=最高分-20  等级为’B’
 * - 成绩>=最高分-30  等级为’C’
 * - 其余            等级为’D’
 * 提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
 *
 * @Author ZhongYuan Cao
 * @Create 2026/1/12 22:23
 * @Version 1.0
 */

public class ArrayTest02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入学生总人数：");
        int numberOfStudents = scan.nextInt();
        System.out.println("学生人数共计："+ numberOfStudents);
        int[] studentScore = new int[numberOfStudents];

        System.out.println("请依次输入"+ numberOfStudents +"位学生的成绩");
        for(int i=0 ; i < numberOfStudents ; i++){
            System.out.print("请输入第"+ (i+1) +"位学生的成绩:");
            studentScore[i] =  scan.nextInt();
//            System.out.print("\n");
        }
        int highestScore = studentScore[0] ;
        for(int j=1; j<numberOfStudents ;j++){
            if( highestScore < studentScore[j] ){
                highestScore =studentScore[j];
            }
        }
        System.out.println("学生分数中最高分为:"+ highestScore );

        String grade = "A";
        for(int k=0; k<numberOfStudents ;k++){

            if( studentScore[k] >= (highestScore-10) ){
                grade = "A";
            }
            else if( studentScore[k] >= (highestScore-20) ){
                grade = "B";
            }
            else if( studentScore[k] >= (highestScore-30) ){
                grade = "C";
            }
            else{
                grade = "D";
            }
            System.out.println("第"+ (k+1) +"位学生的分数为："+ studentScore[k] +"   等级为：" + grade);
        }


        scan.close();
    }
}
