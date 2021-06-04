import java.util.HashSet;
import java.util.Iterator;
//set类集合：HashSet
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("asd");
        hs.add("cvb");
        hs.add("wer");
        //hashset可以添加null元素，对比区分treeset
        hs.add(null);

        //转成数组形式输出：
        Object[] o = hs.toArray();
        for (int i = 0 ; i<o.length ; i++){
            System.out.println(o[i]);
        }
        System.out.println();
        //for的增强型输出：
        for (String str:hs){
            System.out.println(str);
        }
        System.out.println();
        //迭代器的方式
        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
