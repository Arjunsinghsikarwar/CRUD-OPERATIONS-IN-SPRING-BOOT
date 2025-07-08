package com.mySpringCRUDProject.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class StudentInfo {

    @Id
    private int rollNumber;
    private String name;
    private BigDecimal graduationMarks;
    private int tenthMarks;
    private int twelfthMarks;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getGraduationMarks() {
        return graduationMarks;
    }

    public void setGraduationMarks(BigDecimal graduationMarks) {
        this.graduationMarks = graduationMarks;
    }

    public int getTenthMarks() {
        return tenthMarks;
    }

    public void setTenthMarks(int tenthMarks) {
        this.tenthMarks = tenthMarks;
    }

    public int getTwelfthMarks() {
        return twelfthMarks;
    }

    public void setTwelfthMarks(int twelfthMarks) {
        this.twelfthMarks = twelfthMarks;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", graduationMarks=" + graduationMarks +
                ", tenthMarks=" + tenthMarks +
                ", twelfthMarks=" + twelfthMarks +
                '}';
    }
}
