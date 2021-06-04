import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //练习：15个猴子围成一圈选大王，依次1~7循环报数，报到7的猴子被淘汰
        //直到最后一只猴子成为大王，问哪只猴子最后能成为大王

        ArrayList<Integer> monkeys = new ArrayList<>();
        for (int i = 1 ; i <= 15 ; i++){
            monkeys.add(i);
        }

        int num = 0;
        int index = -1;
        while (monkeys.size()>1){
            num++;
            index++;
            if (index>=monkeys.size()){
                index = 0;
            }
            if (num % 7 == 0){
                monkeys.remove(index);
                index--;
            }
        }

        System.out.println(monkeys);
        System.out.println("----------------------");
        System.out.println("the king: "+monkeys.get(0));

    }
}
