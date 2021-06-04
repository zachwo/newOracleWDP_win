import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        //test1 :在C:/OracleWDP/abc下创建一百个文件并删除
        File f = new File("C:/OracleWDP/abc");
        f.mkdir();
//        for (int i = 1 ; i <= 100 ; i++){
//            File f1 = new File("C:/OracleWDP/abc/file"+i+".txt");
//            f1.mkdir();
//        }
//        for (int i = 1 ; i <= 100 ; i++){
//            File f1 = new File("C:/OracleWDP/abc/file"+i+".txt");
//            f1.delete();
//        }

        //test2: 创建100层文件夹
//        File file = new File("C:/OracleWDP");
//        for (int i = 1 ; i <= 100 ; i++){
//            File f2 = new File(file+File.separator+"a"+i);
//            f2.mkdir();
//            file = f2;
//        }
        //方法二
        String str = "C:/OracleWDP";
        for (int i = 1 ; i<=100 ; i++){
            str += ("/"+i);
        }
        File f3 = new File(str);
        f3.mkdirs();

        //test3：逐层删除100层文件夹
        String str1 = str;
        File f4 = new File(str1);
        for (int i = 100 ; i>=1 ; i--){
            f4.delete();
            String str2 = "/" + i;
            str1 = str1.replaceAll( str2, "");
            f4 = new File(str1);
        }

    }
}
