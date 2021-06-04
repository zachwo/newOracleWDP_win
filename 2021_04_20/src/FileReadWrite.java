import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        String addr1 = "C:\\OracleWDP\\aaa.txt";
        String addr2 = "C:\\OracleWDP\\bbb.txt";

        FileReader fr = new FileReader(addr1);
        FileWriter fw = new FileWriter(addr2);

        char[] c = new char[3];
        int length = fr.read(c);
        while (length != -1){
            fw.write(c,0,length);
            length = fr.read(c);
        }
        fw.flush();
        fr.close();
        fw.close();
    }
}
