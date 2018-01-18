package com.example.vamsisaikrishna.mylistview;

/**
 * Created by Vamsisaikrishna on 1/17/2018.
 */

public class Person {

    private  String name;
    private String company;
    private double salary;
    private int image;

    public Person(String name, String company,  double salary, int image) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
