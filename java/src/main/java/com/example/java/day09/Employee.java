package com.example.java.day09;

public class Employee {

    private Integer code;

    private String name;

    private Double aDouble;


    public Employee(Integer code, String name, Double aDouble) {
        this.code = code;
        this.name = name;
        this.aDouble = aDouble;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public void setaDouble(Double aDouble) {
        this.aDouble = aDouble;
    }
}
