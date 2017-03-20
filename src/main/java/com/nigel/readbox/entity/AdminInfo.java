package com.nigel.readbox.entity;

public class AdminInfo {
    private Integer id;

    private String adminCode;

    private String adminName;

    private String adminPwd;

    private String adminPhone;

    private String adminCompany;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode == null ? null : adminCode.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public String getAdminCompany() {
        return adminCompany;
    }

    public void setAdminCompany(String adminCompany) {
        this.adminCompany = adminCompany == null ? null : adminCompany.trim();
    }
}