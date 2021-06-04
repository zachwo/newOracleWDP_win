import java.util.Scanner;

public class GetMin {
    public static void main(String[] args) {
        //从控制台获取用户的输入信息
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = a;
        if (b < min){
            min = b;
        }
        if (c < min){
            min = c;
        }
        System.out.println(min);
    }
}
