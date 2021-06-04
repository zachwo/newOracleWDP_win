import java.io.File;

public class Del {
    public static void main(String[] args) {
        String str = "C:/OracleWDP";
//        for (int i = 1 ; i<=100 ; i++){
//            str += ("/"+i);
//        }
//        File f3 = new File(str);
//        f3.mkdirs();

        //删除OracleWDP文件夹下的所有文件
        File[] files = new File(str).listFiles();
        for (File file:files){
            del(file);
        }
    }

    public static void del(File f){
//        if (f.isDirectory()){
//            File[] files = f.listFiles();
//            for (File file: files){
//                del(file);
//            }
//            f.delete();
//        }else {
//            f.delete();
//        }
        //or:
        if (f.isFile()){
            f.delete();
        }else {
            File[] files = f.listFiles();
            for (File file : files){
                del(file);
            }
        }
    }
}
