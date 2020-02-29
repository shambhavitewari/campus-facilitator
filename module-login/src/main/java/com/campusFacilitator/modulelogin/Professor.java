package com.campusFacilitator.modulelogin;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {


    @Id
    int sapid;
    String password;
    String name;
    String dept;
    String techStack;

    public int getSapid() {
        return sapid;
    }

    public void setSapid(int sapid) {
        this.sapid = sapid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "sapid=" + sapid +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", techStack='" + techStack + '\''+
                '}';
    }
}
