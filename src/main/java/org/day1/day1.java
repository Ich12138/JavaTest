package org.day1;

import java.util.Scanner;

public class day1 {//2.8上机


    public void sumath(){//判断一个自然数是不是质数

        int a = 0;
        boolean ret = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个自然数：");
        a = scanner.nextInt();
        System.out.println("您输入的自然数是："+a);

        if (a>0){
            int k = (int) Math.sqrt(a);
            for (int i = 2; i <=k ; i++) {
                if (k%i==0){
               ret = false;
                    break;
                }
            }


        }
        if (ret){
            System.out.println(a+"是一个素数");
        }else {
            System.out.println(a+"不是素数");
        }
        }





        public void jiecheng(){//计算30的阶乘

        Scanner scanner = new Scanner(System.in);
            System.out.println("输入一个大于零的数实现阶乘");
             int a = scanner.nextInt();
            int sum=1;
            for (int i=1;i<=a;i++){
                sum=sum*i;
            }
            System.out.println(a+"的阶乘为："+sum);

        }


        public void Fibonacci(){//输出20个如下规律的数列 飞伯纳次
           int n = 20;//表示要输出多少个数列中的数字
            int x=1,y=1;//初始化数列的前两个数字

                for(int i=0;i<n;i++){
                    if(i==0){//输出第一项的时候只需要输出x
                        System.out.print(x+" ");
                        continue;//输出完毕后继续循环输出下一项
                    }
                    if(i==1){//输出第二项的时候只需要输出y
                        System.out.print(y+" ");
                        continue;
                    }
                    int z=x+y;//临时变量z用于保存当前应该输出的项的值即前两项的和
                    System.out.print(z+" ");
                    x=y;//在计算下一项之前将前两项分别向后移一项
                    y=z;

            }
        }


        public void view(){

                System.out.println("            A              ");
                System.out.println("          B B B             ");
                System.out.println("        C C C C C             ");
                System.out.println("      D D D D D D D            ");
                System.out.println("    E E E E E E E E E       ");
        }

        public void mathview(){
            System.out.println("1");
            System.out.println("2 3");
            System.out.println("4 5 6");
            System.out.println("7 8 9 10");
        }

        public void sort(){//讲一列乱序的字符按字典顺序排好并输出
          char a[] =new char[]{'a','c','u','b','e','p','f','z'};
            System.out.println("原字符数列为：");
            for (int i = 0; i <a.length ; i++) {
                System.out.print(a[i]+" ");

            }
            System.out.println();
            System.out.println("进行字典排序后为：");
            day1.maosort(a);//调下边的冒泡排序


        }
        public static void maosort(char a[]){//冒泡排序
        char temp = 0;
          for(int i=0;i<a.length-1;i++) {//外层循环控制排序趟数
              for (int j = 0; j < a.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
                  if (a[j] > a[j + 1]) {
                      temp = a[j];
                      a[j] = a[j + 1];
                      a[j + 1] = temp;
                  }
              }
          }
            for (int i = 0; i <a.length ; i++) {
                System.out.print(a[i]+" ");

            }
            }


    public static void main(String[] args) {
        day1 day1 = new day1();
        //day1.sumath();
        // day1.jiecheng();
        //day1.Fibonacci();
       // day1.view();
       // day1.mathview();
        day1.sort();
    }
}
