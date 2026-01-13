class variable {
    public static void main(String args[]) {
        //测试1：（解释见章末企业真题：为什么0.1 + 0.2不等于0.3）
    System.out.println(0.1 + 0.2);//0.30000000000000004

    //测试2：
    float ff1 = 123123123f;
    float ff2 = ff1 + 1;
    System.out.println(ff1);
    System.out.println(ff2);
    System.out.println(ff1 == ff2);

    }
}
