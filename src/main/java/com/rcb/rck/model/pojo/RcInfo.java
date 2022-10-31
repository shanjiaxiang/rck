package com.rcb.rck.model.pojo;

public class RcInfo {
    private Integer id;

    private String name;

    private Integer sex;

    private String birthday;

    private String parties;

    private String work;

    private Integer education;

    private String phone;

    private String mobile;

    private Integer unitCategory;

    private String unitName;

    private Integer level;

    private Integer dutiesCategory;

    private String policyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getParties() {
        return parties;
    }

    public void setParties(String parties) {
        this.parties = parties == null ? null : parties.trim();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getUnitCategory() {
        return unitCategory;
    }

    public void setUnitCategory(Integer unitCategory) {
        this.unitCategory = unitCategory;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getDutiesCategory() {
        return dutiesCategory;
    }

    public void setDutiesCategory(Integer dutiesCategory) {
        this.dutiesCategory = dutiesCategory;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId == null ? null : policyId.trim();
    }
}