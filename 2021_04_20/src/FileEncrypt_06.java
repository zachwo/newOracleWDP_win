import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.*;

/**
 * 对称加密的应用
 */
public class FileEncrypt_06 {
    public static void main(String[] args) throws IOException {
        String addr1 = "C:\\OracleWDP\\向日葵.jpg";
        String addr2 = "C:\\OracleWDP\\向日葵.encrypt.jpg";
        String addr3 = "C:\\OracleWDP\\向日葵.decrypt.jpg";

        //加密：
//        FileInputStream fis = new FileInputStream(addr1);
//        FileOutputStream fos = new FileOutputStream(addr2);
        //解密：
        FileInputStream fis = new FileInputStream(addr2);
        FileOutputStream fos = new FileOutputStream(addr3);

        byte key = 10;  //密钥
        byte[] b = new byte[10];
        int length = fis.read(b);
        while (length!=-1){
            for (int i = 0; i< b.length ;i++){
                b[i] = (byte)(b[i]^key);    //^: 按位进行异或操作
            }

            fos.write(b,0,length);
            length = fis.read(b);
        }
        fos.flush();
        fos.close();
        fis.close();

    }
}
