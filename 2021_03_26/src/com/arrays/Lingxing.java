package com.arrays;

public class Lingxing {
    //输出菱形

    /**
     * kkk*
     * kk*K*
     * k*KKK*
     * *KKKKK*
     * K*KKK*
     * KK*K*
     * KKK*
     *
     * @param args
     */
    public static void main(String[] args) {
        //打印菱形上半部分
        for (int i = 1 ; i<=4 ; i++){
            for (int j = 1 ; j<= 4-i ; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 1 ; j<=2*(i-1)-1 ; j++){
                System.out.print(" ");
            }

            if (i!=1){
                System.out.println("*");
            }else {
                System.out.println();
            }
        }
        //打印菱形下半部分
        for (int i = 3 ; i>0 ;i--){
            for (int j = 1 ; j<= 4-i ; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 1 ; j<=2*(i-1)-1 ; j++){
                System.out.print(" ");
            }

            if (i!=1){
                System.out.println("*");
            }else {
                System.out.println();
            }
        }
    }
}
