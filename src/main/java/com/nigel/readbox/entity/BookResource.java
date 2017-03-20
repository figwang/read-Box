package com.nigel.readbox.entity;

public class BookResource {
    private Integer id;

    private String rsCode;

    private String rsBook;

    private Integer rsAmount;

    private String rsCompany;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRsCode() {
        return rsCode;
    }

    public void setRsCode(String rsCode) {
        this.rsCode = rsCode == null ? null : rsCode.trim();
    }

    public String getRsBook() {
        return rsBook;
    }

    public void setRsBook(String rsBook) {
        this.rsBook = rsBook == null ? null : rsBook.trim();
    }

    public Integer getRsAmount() {
        return rsAmount;
    }

    public void setRsAmount(Integer rsAmount) {
        this.rsAmount = rsAmount;
    }

    public String getRsCompany() {
        return rsCompany;
    }

    public void setRsCompany(String rsCompany) {
        this.rsCompany = rsCompany == null ? null : rsCompany.trim();
    }
}