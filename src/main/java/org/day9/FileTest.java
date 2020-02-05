package org.day9;

import java.io.File;

public class FileTest {
    public void dis(){
        System.out.println("hahahahaha");
    }
    public static void main(String[] args) throws Exception {




        File newFile = new File("/home/wwj/File");//文件路径

        String[] fileList = newFile.list();
        System.out.println("====当前路径下所有文件和路径如下====");
        for (String fileName : fileList)
        {
            System.out.println(fileName);
        }

        showfile(newFile);

    }
    public static void showfile(File f){
        if(f.isDirectory()){
            File[] l=f.listFiles();
            for(File f1:l){
                if(f1.isDirectory()){
                    showfile(f1);
                }else{
                    System.out.println(f.getName());
                }
            }
        }else{
            System.out.println(f.getName());
        }
    }
}