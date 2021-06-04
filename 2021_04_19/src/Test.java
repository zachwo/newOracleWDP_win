import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //IO流、file文件类
        //各种流的文件处理
        //1.文件的创建与删除
        File f = new File("C:\\OracleWDP\\abc.txt");
        //等价于File f = new File("C:/OracleWDP/abc.txt");
        if(!f.exists()){
            if(f.createNewFile()){
                System.out.println("文件创建成功");
            }
        }
        String s = f.getName();// 获取文件名
        long length =  f.length(); // 获取文件大小
        boolean readable = f.canRead();// 文件能否读取
        System.out.println(s + " " + length + " " + readable);
        File f0 = new File("C:/OracleWDP/cde.txt");
        f.renameTo(f0); //文件重命名的后缀名（.txt）必须一致

//
//        //文件夹的创建与删除
        File f1 = new File("C:/OracleWDP/abc1");
//        File f2 = new File("C:/OracleWDP/abc/abc");
//        f1.mkdir();//make directory创建单层文件夹
//        f2.mkdirs();//make directories 创建多层文件夹

        File f10 = new File("C:/OracleWDP/abc10");
        f1.renameTo(f10);

        




    }
}
