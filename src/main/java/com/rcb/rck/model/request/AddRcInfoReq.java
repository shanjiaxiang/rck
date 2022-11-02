package com.rcb.rck.model.request;

import javax.validation.constraints.NotNull;

public class AddRcInfoReq {
    @NotNull(message = "姓名不能为空")
    private String name;
    @NotNull(message = "性别不能为空")
    private Integer sex;
    @NotNull(message = "生日不能为空")
    private String birthday;

    @NotNull(message = "政治面貌不能为空")
    private String parties;
    @NotNull(message = "工作单位和职务不能为空")
    private String work;
    @NotNull(message = "学历不能为空")
    private Integer education;
    @NotNull(message = "电话不能为空")
    private String phone;
    @NotNull(message = "手机不能为空")
    private String mobile;

    @NotNull(message = "单位类别不能为空")
    private Integer unitCategory;
    @NotNull(message = "单位名称不能为空")
    private String unitName;
    @NotNull(message = "宣传员等级不能为空")
    private Integer level;
    @NotNull(message = "宣传员类别不能为空")
    private Integer dutiesCategory;
    @NotNull(message = "人才类型不能为空")
    private String policyId;

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