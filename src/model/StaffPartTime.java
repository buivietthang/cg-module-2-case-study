package model;

public class StaffPartTime extends Staff {
    private double timeWork;

    public StaffPartTime(double timeWork) {
        this.timeWork = timeWork;
    }

    public StaffPartTime(String name, String gender, int age, String idCard, String email, boolean status, double timeWork) {
        super(name, gender, age, idCard, email, status);
        this.timeWork = timeWork;
    }

    public double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(double timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public double getSumSalary() {
        return timeWork * 50000;
    }

    @Override
    public String toString() {
        return "Nhân viên Part Time [" +
                " Tên: " + getName() +
                ", Giới tính: " + getGender() +
                ", Tuổi: " + getAge() +
                ", CMND: " + getIdCard() +
                ", Email: " + getEmail() +
                ", Tình trạng: " + getStatus() +
                ", Thời gian làm việc: " + timeWork +
                ", Tiền lương: " + getSumSalary() +
                " ]";
    }
}
