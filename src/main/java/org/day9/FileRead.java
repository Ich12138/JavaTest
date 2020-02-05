package org.day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead{
    public String Reader(String url) {
        String str =null;
        try {
            FileReader fr = new FileReader(url);//要读文件的路径
            BufferedReader br = new BufferedReader(fr);
            new String();

            while((str=br.readLine())!=null){
                str+=str+"\n";
                System.out.println(str);
            }
//            char[] cbuf = new char[32];
//            int hasRead = 0;
//            while ((hasRead = fr.read(cbuf)) > 0) {
//                System.out.print(new String(cbuf, 0, hasRead));
//            }
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return str;
    }
}