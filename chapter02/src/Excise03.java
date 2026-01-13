/**
 * 为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
 * @author caozhongyuan
 * @date   2026年1月5日
 */
public class Excise03 {
    public static void main(String a[]){
        int fightTime = 89;
        int day = fightTime/24;
        int hour = fightTime%24;
        System.out.println("战士共作战了"+ day +"天零"+ hour +"小时");
    }
}
