package com.java8.funtionalinterface.predicate;

public class SoftwareEngineer {
    private String name;
    private int age;
    private boolean ishavinggf;

    public SoftwareEngineer(String name, int age, boolean ishavinggf) {
        this.name = name;
        this.age = age;
        this.ishavinggf = ishavinggf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIshavinggf() {
        return ishavinggf;
    }

    public void setIshavinggf(boolean ishavinggf) {
        this.ishavinggf = ishavinggf;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ishavinggf=" + ishavinggf +
                '}';
    }
}
