import java.util.Iterator;
import java.util.TreeSet;

//Set类集合：TreeSet，TreeSet与HashSet最大的区别就是TreeSet不允许添加null元素而HashSet可以
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("a11");
        ts.add("b");
        ts.add("1c111");
        //add(null)会产生运行时异常（空指针异常）
        try {
            ts.add(null);
        }catch (NullPointerException e){
            System.out.println(e);
        }
        //ts.add(null);

        Iterator<String> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
