import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i<3 ; i++){
            int guess = scanner.nextInt();
            if (guess < x){
                System.out.println("小了");
            }
            if (guess > x){
                System.out.println("大了");
            }
            if (guess == x){
                System.out.println("对了");
                break;
            }
        }
    }
}
