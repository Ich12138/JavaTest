package org.day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteCopy {

    public static void main(String[] args) {

        ByteCopy bc = new ByteCopy();
        try {
            bc.copy1();
            bc.copy2();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //单字节的拷贝
    public void copy1() throws Exception {

        //首先构建输入流的对象,指定需要读取的文件路径
        FileInputStream fis =
                new FileInputStream("/home/wwj/File/hhh");

        //构建文件输出流的对象，即将文件复制在哪里去,后面的true代表每次写入时不清空当前文件内容
        FileOutputStream fos =
                new FileOutputStream("/home/wwj/File/aaa", true);

        //一个字节一个字节的读取文件的内容
        int value = fis.read();

        //把读取的一个字节写出
        while (value != -1) {
            fos.write(value);
            fos.flush();
            value = fis.read();
        }
        //读取完毕后关闭流
        fis.close();
        fos.close();
    }

    //利用字节数组拷贝
    public void copy2() throws Exception {

        //首先构建输入流的对象,指定需要读取的文件路径
        FileInputStream fis =
                new FileInputStream("/home/wwj/File/hhh");

        //构建文件输出流的对象，即将文件复制在哪里去,后面的true代表每次写入时不清空当前文件内容
        FileOutputStream fos =
                new FileOutputStream("/home/wwj/File/aaa", true);

        //构建字节数组
        byte[] bytes = new byte[1024];

        //把读取的字节存入到字节数组中
        int len = fis.read(bytes);

        //把读取的字节数组写出，注意一一对应
        while (len != -1) {
            /*
             * 利用第一种写出，查看文件属性可知，复制后的文件大小和原来文件大小不一致
             * 原因是当最后一次读取没有1024字节时，也会写出1024个字节
             * 所以我们采用第二种写出方式
             */
//			fos.write(bytes);
            fos.write(bytes, 0, len);
            fos.flush();
            len = fis.read(bytes);
        }
        //读取完毕后关闭流
        fis.close();
        fos.close();
    }
}
