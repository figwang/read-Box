package com.nigel.readbox.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BookInfo {
    private Integer id;

    private String bookIsbn;

    private String bookName;

    private String bookAuthor;

    private Date bookPublishDate;

    private String bookPublishHouse;

    private BigDecimal bookPrice;

    private String bookPhoto;

    private String bookIntroduce;

    private Integer bookIscloud;

    private String bookUrl;

    private String bookCompany;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn == null ? null : bookIsbn.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public Date getBookPublishDate() {
        return bookPublishDate;
    }

    public void setBookPublishDate(Date bookPublishDate) {
        this.bookPublishDate = bookPublishDate;
    }

    public String getBookPublishHouse() {
        return bookPublishHouse;
    }

    public void setBookPublishHouse(String bookPublishHouse) {
        this.bookPublishHouse = bookPublishHouse == null ? null : bookPublishHouse.trim();
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPhoto() {
        return bookPhoto;
    }

    public void setBookPhoto(String bookPhoto) {
        this.bookPhoto = bookPhoto == null ? null : bookPhoto.trim();
    }

    public String getBookIntroduce() {
        return bookIntroduce;
    }

    public void setBookIntroduce(String bookIntroduce) {
        this.bookIntroduce = bookIntroduce == null ? null : bookIntroduce.trim();
    }

    public Integer getBookIscloud() {
        return bookIscloud;
    }

    public void setBookIscloud(Integer bookIscloud) {
        this.bookIscloud = bookIscloud;
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl == null ? null : bookUrl.trim();
    }

    public String getBookCompany() {
        return bookCompany;
    }

    public void setBookCompany(String bookCompany) {
        this.bookCompany = bookCompany == null ? null : bookCompany.trim();
    }
}