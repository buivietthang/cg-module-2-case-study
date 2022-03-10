package model;

import java.io.Serializable;

public abstract class Staff implements Serializable {
    private String name;
    private String gender;
    private int age;
    private String idCard;
    private String email;
    private boolean status;
    private double salary;

    public Staff() {
    }

    public abstract double getSumSalary();

    public Staff(String name, String gender, int age, String idCard, String email, boolean status) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.idCard = idCard;
        this.email = email;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getStatus() {
        return status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // thay đổi trạng thái
    public void changeStatus() {
        this.status = !this.status;
    }

    @Override
    public String toString() {
        return "Staff{" +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", idCard='" + idCard + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                '}';
    }
}
