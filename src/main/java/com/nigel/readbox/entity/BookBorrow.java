package com.nigel.readbox.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BookBorrow {
    private Integer id;

    private String bwCode;

    private String bwBookCode;

    private String bwUserCode;

    private Date bwLendTime;

    private Date bwBackTime;

    private String bwIsexpired;

    private BigDecimal bwFineAmount;

    private Integer bwIslend;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBwCode() {
        return bwCode;
    }

    public void setBwCode(String bwCode) {
        this.bwCode = bwCode == null ? null : bwCode.trim();
    }

    public String getBwBookCode() {
        return bwBookCode;
    }

    public void setBwBookCode(String bwBookCode) {
        this.bwBookCode = bwBookCode == null ? null : bwBookCode.trim();
    }

    public String getBwUserCode() {
        return bwUserCode;
    }

    public void setBwUserCode(String bwUserCode) {
        this.bwUserCode = bwUserCode == null ? null : bwUserCode.trim();
    }

    public Date getBwLendTime() {
        return bwLendTime;
    }

    public void setBwLendTime(Date bwLendTime) {
        this.bwLendTime = bwLendTime;
    }

    public Date getBwBackTime() {
        return bwBackTime;
    }

    public void setBwBackTime(Date bwBackTime) {
        this.bwBackTime = bwBackTime;
    }

    public String getBwIsexpired() {
        return bwIsexpired;
    }

    public void setBwIsexpired(String bwIsexpired) {
        this.bwIsexpired = bwIsexpired == null ? null : bwIsexpired.trim();
    }

    public BigDecimal getBwFineAmount() {
        return bwFineAmount;
    }

    public void setBwFineAmount(BigDecimal bwFineAmount) {
        this.bwFineAmount = bwFineAmount;
    }

    public Integer getBwIslend() {
        return bwIslend;
    }

    public void setBwIslend(Integer bwIslend) {
        this.bwIslend = bwIslend;
    }
}