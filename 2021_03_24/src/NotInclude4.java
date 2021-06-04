
public class NotInclude4 {
    //test 3： 求500以内不包含4的自然数个数
//    public static void main(String[] args) {
//        int num = 0;
//        for (int i = 1 ; i<= 500 ;i++){
//            if (i%10==4 || i/10%10==4 || i/100==4){
//                num++;
//            }
//        }
//        System.out.println(500-num);
//    }
    //test 4:
//    public static void main(String[] args) {
//        for (int x = 1;x<=150;x++){
//            if (x/(150-x) == 3 && x%(150-x)==10){
//                System.out.println(x + " " + (150-x));
//            }
//        }
//    }
    //test 5:
//    public static void main(String[] args) {
//        for (int people = 380 ;people <=450 ;people ++){
//            for (int boy = 1 ; boy <= people ; boy ++){
//                int girl = people - boy;
//                if (boy*75 + girl*80.1 == people*76){
//                    System.out.println(boy+ " " + girl);
//                }
//            }
//        }
//    }
    //test6
//    public static void main(String[] args) {
//        for (int i = 1000 ; i<9999; i++ ){
//            if ((i%1000)*3 == i){
//                System.out.println(i);
//            }
//        }
//    }
    //test7
    public static void main(String[] args) {
        for (int i = 10 ;i<=99 ; i++){
            if(Math.abs((i+300)-(i*10+3))==468){
                System.out.println(i);
            }
        }
    }
}
