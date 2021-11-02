package com.mystudent11.demomystudent11.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="studentdb")
public class user {

    @Id
    private long id;

    private String fname;
    private String lname;
    private int age;
    private String Occupation;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

}
