public class HomeWork {
    public static void main(String[] args) {
        //test1: 打印某年某月有多少天（ps.闰年的计算方法：年数能被4整除且不能被100整除，或者能被400整除的年份）
        int year = 2012;
        int month = 4;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31天");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30天");
                break;
            case 2:
                if ((year%4 == 0 && year%100 != 0) || year%400 == 0){
                    System.out.println("是闰年，2月有29天");
                }else {
                    System.out.println("是平年，2月有28天");
                }
        }
        System.out.println("-------------------------");
        //test17:略

    }
}
