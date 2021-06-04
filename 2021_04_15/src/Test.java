import java.util.*;

/**
 * HashMap<Key,Value>
 * hashMap的元素是entry
 *
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("2008","Italy");
        hm.put("2012","Brazil");
        hm.put("2016","Greece");
        hm.put("2008","China");
        System.out.println("length:"+hm.size());
        String str = hm.get("2008");
        System.out.println(str);

        System.out.println("-------------获取键的集合-----------------------");
        Set<String> ks = hm.keySet();
        for (String s : ks){
            System.out.println(s + ": " + hm.get(s));
        }
        System.out.println("-------------获取值的集合-----------------------");
        Collection<String> vs = hm.values();
        for (String s1 : vs){
            System.out.println(s1);
        }

        System.out.println("-------------获取键值对的集合-----------------------");
        System.out.println("-----------For的增强型实现----------------");
        Set<Map.Entry<String, String>> se =  hm.entrySet(); //使用entrySet获取键值对
        for (Map.Entry<String, String> e : se){
            System.out.println(e.getKey() + "  "+e.getValue());
        }
        System.out.println("-----------迭代器实现-----------------");
        Iterator<Map.Entry<String, String>> it = se.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> e = it.next();
            System.out.println(e.getKey()+ " "+ e.getValue());
        }
        //System.out.println("-------------练习-----------------------");
        //创建一个ArrayList集合，里面放三个学生对象，有一班的学生和二班的学生
        //求：一班所有学生的分数 和 二班的性别比例
//        Student stu1 = new Student(001, "stu1", 18, "男",99,"1班");
//        Student stu2 = new Student(002, "stu2", 19, "女",80,"1班");
//        Student stu3 = new Student(003, "stu3", 19, "女",94,"2班");
//        Student stu4 = new Student(004, "stu4", 17, "男",93,"2班");
//        Student stu5 = new Student(005, "stu5", 20, "男",85,"2班");
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(stu1);
//        list.add(stu2);
//        list.add(stu3);
//        list.add(stu4);
//        list.add(stu5);


    }
}
