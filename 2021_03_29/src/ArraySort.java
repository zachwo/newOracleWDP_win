import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        //冒泡排序
        int[] array =new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length ;i++){
            array[i] = random.nextInt(100);//随机产生0~100之间的整数；
        }
        int[] arrayOriginal = array.clone();
        System.out.println(Arrays.toString(arrayOriginal));

//        for (int i = 0 ; i<array.length-1 ; i++){
//            for (int j = i+1; j <array.length ;j++){
//                if (array[i] > array[j]){
//                    int t = array[i];
//                    array[i] = array[j];
//                    array[j] = t;
//                }
//            }
//        }

//        for (int i = 0 ; i < array.length ; i++){
//            for (int j = 0 ; j<array.length-1-i;j++){
//                if (array[j] > array[j+1]){
//                    int t = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = t;
//                }
//            }
//        }

        //2、选择排序：相邻两个元素比较，记录较小的元素位置，最后进行交换
//        for (int i = 0 ; i < array.length ; i++){
//            int minLoc = i;//记录当前最小值的位置
//            for(int j = i+1 ;j< array.length ; j++){
//                if (array[j]<array[minLoc]){
//                    minLoc = j;
//                }
//            }
//            if (minLoc != i){
//                int t = array[i];
//                array[i] = array[minLoc];
//                array[minLoc] = t;
//            }
//        }

        //3、Arrays.sort()
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

    }
}
