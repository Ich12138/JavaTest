package org.day8.book;

import java.util.Date;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private String pubDate;
    private double prcie;

    public Book() {
    }

    public Book(String ISBN, String title, String author, String pubDate, double prcie) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.prcie = prcie;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public double getPrcie() {
        return prcie;
    }

    public void setPrcie(double prcie) {
        this.prcie = prcie;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubDate=" + pubDate +
                ", prcie=" + prcie +
                '}';
    }
}
