public class GuessPeople {
    public static void main(String[] args) {
        for (int i = 100 ; i < 200 ; i++){
            if (i%3==1 && i%4==2 && i%5==3){
                System.out.println(i);
            }
        }
    }
}

