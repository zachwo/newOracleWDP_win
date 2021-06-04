import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件拆分练习（应用：p2p,分布式部署）
 */
public class FileSplit {
    public static void main(String[] args) throws IOException {
//        String addr = "C:\\OracleWDP\\向日葵.jpg";
//        String addr_i = "C:\\OracleWDP\\向日葵_part1.jpg";
//        String addr_ii = "C:\\OracleWDP\\向日葵_part2.jpg";
        String addr = "C:\\OracleWDP\\abc.txt";
        String addr_i = "C:\\OracleWDP\\abc_part1.txt";
        String addr_ii = "C:\\OracleWDP\\abc_part2.txt";

        File f = new File(addr);
        FileInputStream fis = new FileInputStream(f);
        FileOutputStream fos1 = new FileOutputStream(addr_i);
        FileOutputStream fos2 = new FileOutputStream(addr_ii);

        byte[] b = new byte[2];
        int length = fis.read(b);
        long total_length = f.length();
        int sum = 0;
        while (length!=-1){
            sum += length;
            if (sum <= total_length/2){
                fos1.write(b,0,length);
            }else {
                fos2.write(b,0,length);
            }
            length = fis.read(b);
        }
        fis.close();
        fos1.flush();
        fos2.flush();
        fos1.close();
        fos2.close();

    }
}
