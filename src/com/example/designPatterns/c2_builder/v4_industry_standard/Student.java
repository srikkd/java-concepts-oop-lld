package com.example.designPatterns.c2_builder.v4_industry_standard;

// this design of 1 Giant constructor can lead to many issues:
// 1. Lot of cross-check while filling param-values in client to ensure the correct order and data-type.
// 2. not easy to understand: eg: 26, 38: which one is age and psp etc. like confusions.
// 3. Client may end-up sending lots of null values if he doesn't want to set certain attributes: its unnecessary work.

// this design solves all of above problems of 1 giant constructor design,
// but, it has its own issues: as you can see while coding its constructor
// 1. Lot of extra type-casting to convert from Object to its appropriate DT of the attribute.
// 2. No Type-safety at CT in Client's code: client can pass Integer value in email etc.
// 3. No safety against Typos in the attribute-anmes :)in the Client's code:
//      it can lead to that attribute remaining uninitialized.
// can we use another class, instead of HashMap, to resolve above issues: that class will have same attributes as Student
// So, we are using a Builder class which solves all of above problems.
// Technically, it can be used for correctness and without much issues.
// But, the code still doesn't look beautiful:
// 2 problems:
// 1. Client has to KNOW ABOUT BUILDER CLASS, in order to create Student object
// 2. ALSO, CLIENT can MISUSE THE PUBLIC CONSTRUCTOR OF STUDENT BY PASSING NULL
// lets try to solve above issues in v3:
// v3 solves the above 2 issues:
// 1. getBuilderObject() method inside Student class itself
// 2. make Student constructor private and call it from Builder class which is inside the Student class itself
// through a build() method.

// above code works fine with solving all problems: but, we can make it more beautiful in v4
// can we transform the above code, something as follows:
// .

public class Student {
    private String name;
    private Integer age;
    private Double psp;
    private String universityName;
    private String batch;
    private Long id;
    private Integer gradYear;
    private String phoneNumber;
    private String email;

    private Student(Builder builder){

        // validation starts
        if(builder.getGradYear() != null) {
            if ( builder.getGradYear() > 2022 ) {
                throw new IllegalArgumentException("Grad year cannot be greater than 2022");
            }
        }
        // validation completed
        // validation logic can be handed-over to builder class also: see validate() method
        // its good infact: every responsibility to create Student object is on Builder class
        // 1. to validate, 2. to provide a good interface, 3. to provide helper methods
        // here, we may not prefer SRP : main purpose of Builder design pattern takes preference

        this.name = builder.getName();

        this.age = builder.getAge();

        this.psp = builder.getPsp();

        this.universityName = builder.getUniversityName();

        this.batch = builder.getBatch();

        this.id = builder.getId();

        this.gradYear = builder.getGradYear();

        this.phoneNumber = builder.getPhoneNumber();

        this.email = builder.getEmail();
    }

    public static Builder getBuilderObject(){
        return new Builder();
    }

    public static class Builder {
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

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setGradYear(Integer gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private boolean validate(){
            if( this.age < 18 || (2000+this.age > 2025) ){
                return false;
            }
            return true;
        }
        public Student build(){
            if( !validate() ){
                throw new IllegalArgumentException("Pls pass appropriate arguments for Student object.");
            }

            return new Student(this);
        }
    }


}
