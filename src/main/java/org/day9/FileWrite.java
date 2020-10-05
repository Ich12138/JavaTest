package org.day9;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void filewriter() {
        try {
            FileWriter fw = new FileWriter("poem.txt", true);
            fw.write("有钱不要非君子，\r\n");
            fw.write("跟钱有仇是小人。\r\n");
            fw.flush();
            fw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
