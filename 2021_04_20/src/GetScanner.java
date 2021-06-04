import javax.annotation.processing.Filer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GetScanner {
    public static void main(String[] args) throws IOException {
        String addr = "C:/OracleWDP/get.txt";
        File f = new File(addr);
        if (!f.exists()) {
            f.createNewFile();
        }

        FileWriter fw = new FileWriter(addr,true);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < 3 ; i++){
            String str = scanner.nextLine();
            fw.write(str);
            fw.write("\r\n");
        }
        fw.flush();
        fw.close();

        FileReader fr = new FileReader(addr);
        char[] c = new char[3];
        int length = fr.read(c);
        while (length != -1){
            String str = new String(c,0,length);
            System.out.println(str);
            length = fr.read(c);
        }
        fr.close();


    }
}
