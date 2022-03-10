package model;

public class StaffFullTime extends Staff {
    private double coefficient;

    public StaffFullTime(double coefficient) {
        this.coefficient = coefficient;
    }

    public StaffFullTime(String name, String gender, int age, String idCard, String email, boolean status, double coefficient) {
        super(name, gender, age, idCard, email, status);
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    @Override
    public double getSumSalary() {
        return coefficient * 5000000;
    }

    @Override
    public String toString() {
        return "Nhân viên Full Time [" +
                " Tên: " + getName() +
                ", Giới tính: " + getGender() +
                ", Tuổi: " + getAge() +
                ", CMND: " + getIdCard() +
                ", Email: " + getEmail() +
                ", Tình trạng: " + getStatus() +
                ", Hệ số lương: " + coefficient +
                ", Tiền lương: " + getSumSalary() +
                " ]";
    }
}
