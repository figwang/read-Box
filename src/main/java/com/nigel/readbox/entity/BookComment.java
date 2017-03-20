package com.nigel.readbox.entity;

import java.util.Date;

public class BookComment {
    private Integer id;

    private String commentCode;

    private String commentContents;

    private Date commentTime;

    private String commentUser;

    private String commentIsbn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentCode() {
        return commentCode;
    }

    public void setCommentCode(String commentCode) {
        this.commentCode = commentCode == null ? null : commentCode.trim();
    }

    public String getCommentContents() {
        return commentContents;
    }

    public void setCommentContents(String commentContents) {
        this.commentContents = commentContents == null ? null : commentContents.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser == null ? null : commentUser.trim();
    }

    public String getCommentIsbn() {
        return commentIsbn;
    }

    public void setCommentIsbn(String commentIsbn) {
        this.commentIsbn = commentIsbn == null ? null : commentIsbn.trim();
    }
}