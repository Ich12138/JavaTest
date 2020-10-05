package org.day8;


import java.util.LinkedList;

public class Links {
    LinkedList lk = new LinkedList();

    public void push(Object o) {

        // 添加
        lk.addFirst(o);
    }

    public void pop() {

        // 移除
        lk.removeFirst();
    }

    public static void main(String[] args) {
        // 使用  LinkedList实现堆栈
        // 入栈  出栈
        // 每次进入一个元素，后  进入的元素在本身在堆栈元素里面的上
        // 所以在新元素对于本身存在的元素进行了 压栈的操作
        //  LinkedList 为什么能够来实现堆栈的效果？
        // LinkedList 是一个链表形式的集合  第一个和最后一个

        // 实例化 LinkedList  得到方法  addFirst removeFirst

    	/* LinkedList l=new LinkedList<>();
    		l.addFirst("a");
    		l.removeFirst(); */

        //实例化 当前对象 Test
        Links link = new Links();// 添加数据 1 2 3 4
        link.push("1");
        link.push("2");
        link.push("3");
        link.push("4");
        // 弹出
        link.pop();
        for (Object object : link.lk) {
            System.out.println(object);
        }
    }
}
