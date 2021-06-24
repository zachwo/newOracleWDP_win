import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = sc.nextInt(); //获取用户输入的整数值
        double xx = sc.nextDouble(); //获取用户输入的小数值
        String str = sc.next(); //读取用户输入的信息，以空格或回车作为结束标志,一般用于接收单个字符
        char c = sc.next().charAt(0);//获取用户输入的第（一）个字符
        String str1 = sc.nextLine(); //接收用户输入的一行数据，以回车\n作为结束标志

        System.out.println(x);
        System.out.println(xx);
        System.out.println(str);
        System.out.println(str1.trim());//trim去除string首尾空格
    }
}
