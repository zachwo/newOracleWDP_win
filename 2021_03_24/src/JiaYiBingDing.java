public class JiaYiBingDing {
    public static void main(String[] args) {
        int total = 370;
        int equalnum = - 11;
        for (int i = 1 ;i<=370 ;i++){
            if ((i-10) + (i+20) + (i/2) +(i*2) == 370){
                equalnum = i;
                System.out.println(equalnum - 10);
            }
        }

    }
}
