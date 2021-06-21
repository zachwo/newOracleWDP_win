import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//字节流：XXXStream
public class Test_for_ZiJieLiu_05 {
    public static void main(String[] args) throws IOException {
        String addr1 = "C:/OracleWDP/魔戒1（魔戒现身）.mp4";
        String addr2 = "C:/OracleWDP/copyvideo.mp4";

        FileInputStream fis = new FileInputStream(addr1);
        FileOutputStream fos = new FileOutputStream(addr2);
        byte[] b = new byte[1024];
        int length = fis.read(b);
        while (length!=-1){
            fos.write(b,0,length);
            length = fis.read(b);
        }
        fos.flush();
        fos.close();
        fis.close();



    }
}
