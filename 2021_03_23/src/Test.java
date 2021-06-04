import java.util.zip.DeflaterOutputStream;

public class Test {
    public static void main(String[] args) {
        int score = 75;
        System.out.println(score >= 80 && score <= 90);

        if (score >= 80 && score <= 90){
            System.out.println(score + "： 良好");
        }else{
            System.out.println(score + ": 其它");
        }
        System.out.println("-----------------------------");
        char sex = '妖';
        if (sex == '男'){
            System.out.println("娶媳妇");
        }else if (sex == '女'){
            System.out.println("嫁老公");
        }else {
            System.out.println("待定");
        }
        System.out.println("-----------------------------");
        int i = 1;
        switch (i){     //i 只能是可以转化为int类型的值
            default:
                System.out.println("default");
            case 1:
                System.out.println("1");
                //break;
            case 2:
                System.out.println("2");
                //break;
        }
        System.out.println();
        //循环结构
        int i1 = 0;
        while (i1 < 10){
            System.out.println("我要上大学"+i1);
            i1++;
        }
        System.out.println();
        int i2 = 0;
        do {
            System.out.println(i2 + "我要上大学");
            i2++;
        }while (i2<10);
        System.out.println();
        for (int i3 = 0 ; i3 < 10 ; i3++){
            System.out.println(i3 + "我要上大学");
        }
    }
}
