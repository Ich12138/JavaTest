package org.day8.book;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("3215", "三国演绎", "罗贯中", "2019.02.5", 10.0);
        Book book1 = new Book("4215", "红", "罗贯中1", "2020.2.5", 100.0);
        Book book2 = new Book("115", "绎", "罗贯中2", "2019.04.15", 190.0);
        Book book3 = new Book("1215", "三", "罗贯中3", "2019.02.35", 120.0);
        Book book4 = new Book("5315", "演绎", "罗贯中4", "2019.12.5", 110.0);

        HashMap<String, Book> hashMap = new HashMap<String, Book>();
        hashMap.put(book.getISBN(), book);
        hashMap.put(book1.getISBN(), book1);
        hashMap.put(book2.getISBN(), book2);
        hashMap.put(book3.getISBN(), book3);
        hashMap.put(book4.getISBN(), book4);

        for (String s : hashMap.keySet()) {
            System.out.println(hashMap.get(s));

        }
    }
}
