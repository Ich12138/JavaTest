package org.day9;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CharCopy {

    public static void main(String[] args) {
        CharCopy cc = new CharCopy();
        try {
            cc.copy1();
            cc.copy2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void copy1() throws Exception{
        //构建字符输入流对象
        FileReader fr =
                new FileReader("/home/wwj/File/hhh");

        //构建字符输出流对象
        FileWriter fw =
                new FileWriter("/home/wwj/File/aaa");

        //读取单个字符
        int value=fr.read();

        //输出单个字符
        while(value!=-1){
            fw.write(value);
            fw.flush();
            value=fr.read();
        }

        fr.close();
        fw.close();
    }

    public void copy2() throws Exception{
        //构建字符输入流对象
        FileReader fr =
                new FileReader("/home/wwj/File/hhh");

        //构建字符输出流对象
        FileWriter fw =
                new FileWriter("/home/wwj/File/aaa");
        //构建字符数组
        char [] chars = new char[1024];
        //把读取的字符存入字符数组中
        int len =fr.read(chars);
        //把字符数组中的数据写出
        while(len!=-1){
            fw.write(chars, 0, len);
            fw.flush();
            len =fr.read(chars);
        }
        //关闭流操作
        fr.close();
        fw.close();
    }

}
