//package org.day9;
//package p0119.serializable.diffclass;
//
//import org.day3.animal.Animal;
//
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
//public class Serializable {
//    //文件输出流
//    static FileOutputStream fos = null;
//    //对象输出流
//    static ObjectOutputStream oos=null;
//    //字节输出流
//    static ByteArrayOutputStream bo=null;
//    //File对象
//    static File file = new File("b.bin");
//
//    public static void main(String[] args) {
//        try {
//            //true为写入文件时追加而不是覆盖
//            fos=new FileOutputStream(file,true);
//            //用字节数组输出流的目的是，对象序列化到流中后，可以使用这个流的toByteArray方法
//            bo=new ByteArrayOutputStream();
//            oos=new ObjectOutputStream(bo);
//
////			Man m = new Man("tom", 12);
//         //   Animal a = new Animal("dog", "man");
//            //序列化对象
//            oos.writeObject(a);
//            //数据有多长数组就多大，不会产生多余占用空间
//            byte[] buff = bo.toByteArray();
//
//            //len为序列化后的长度
//            int len=buff.length;
//            //写入文件之前的文件长度，用于反序列化时的seek
//            long beforLength = file.length();
//            System.out.println("Seek:"+beforLength);
//            System.out.println("Length:"+len);
//
//            //将存有序列化后的对象的byte数组写入文件
//            fos.write(buff);
//            fos.flush();
//            oos.close();
//            fos.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}