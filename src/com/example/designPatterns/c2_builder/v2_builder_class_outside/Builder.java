package com.example.designPatterns.c2_builder.v2_builder_class_outside;

public class Builder {
    private String name;
    private Integer age;
    private Double psp;
    private String universityName;
    private String batch;
    private Long id;
    private Integer gradYear;
    private String phoneNumber;
    private String email;

    public String getName(){
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getPsp() {
        return psp;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getBatch() {
        return batch;
    }

    public Long getId() {
        return id;
    }

    public Integer getGradYear() {
        return gradYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPsp(Double psp) {
        this.psp = psp;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGradYear(Integer gradYear) {
        this.gradYear = gradYear;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
