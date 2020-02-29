package com.campusFacilitator.modulelogin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    int sapid;
    String assword;
    String branch;
    String name;
    String techStack ;
    int year;

    public int getSapid() {
        return sapid;
    }

    public void setSapid(int sapid) {
        this.sapid = sapid;
    }

    public String getAssword() {
        return assword;
    }

    public void setAssword(String assword) {
        this.assword = assword;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sapid=" + sapid +
                ", password='" + assword + '\'' +
                ", branch='" + branch + '\'' +
                ", name='" + name + '\'' +
                ", techStack='" + techStack + '\'' +
                ", year=" + year +
                '}';
    }
}

