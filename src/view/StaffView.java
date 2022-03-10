package view;

import model.Staff;
import model.StaffFullTime;
import model.StaffPartTime;
import service.StaffService;
import validate.StaffValidate;

import java.util.List;
import java.util.Scanner;

public class StaffView {
    Scanner scanner = new Scanner(System.in);
    StaffService staffService = new StaffService();

    public int menuAdmin() {
        System.out.println("||                   MENU ADMIN                   ||");
        System.out.println("||      1. Thêm nhân viên                         ||");
        System.out.println("||      2. Sửa nhân viên                          ||");
        System.out.println("||      3. Xóa nhân viên                          ||");
        System.out.println("||      4. Hiển thị tất cả nhân viên              ||");
        System.out.println("||      5. Sắp xếp nhân viên theo CMND            ||");
        System.out.println("||      6. Thay đổi trạng thái của nhân viên      ||");
        System.out.println("||      7. Đăng xuất                              ||");
        return Integer.parseInt(scanner.nextLine());
    }

    public int menuUser() {
        System.out.println("||          MENU USER          ||");
        System.out.println("||      1. Thêm nhân viên      ||");
        System.out.println("||      2. Sửa nhân viên       ||");
        System.out.println("||      3. Xóa nhân viên       ||");
        System.out.println("||      4. Đăng xuất           ||");
        return Integer.parseInt(scanner.nextLine());
    }

    public int menuAdd() {
        System.out.println("||            THÊM NHÂN VIÊN             ||");
        System.out.println("||      1. Thêm nhân viên Full Time      ||");
        System.out.println("||      2. Thêm nhân viên Part Time      ||");
        System.out.println("||      3. Đăng xuất                     ||");
        return Integer.parseInt(scanner.nextLine());
    }

    public Staff createStaff(boolean isFullTime) {
        String name = StaffValidate.nameValidate();
        System.out.println("||      Nhập giới tính      ||");
        String gender = scanner.nextLine();
        int age = StaffValidate.ageValidate();
        String idCard = StaffValidate.idCardValidate();
        String email = StaffValidate.emailValidate();
        System.out.println("Nhập tình trạng (true hoặc false)");
        boolean status = Boolean.parseBoolean(scanner.nextLine());

        if (isFullTime) {
            System.out.println("Nhập hệ số lương");
            double coefficient = Double.parseDouble(scanner.nextLine());
            StaffFullTime staffFullTime = new StaffFullTime(name, gender, age, idCard, email, status, coefficient);
            return staffFullTime;
        } else {
            System.out.println("Nhập thời gian làm việc");
            double timeWork = Double.parseDouble((scanner.nextLine()));
            StaffPartTime staffPartTime = new StaffPartTime(name, gender, age, idCard, email, status, timeWork);
            return staffPartTime;
        }
    }

    public void showStaff(List<Staff> staffs) {
        for (Staff staff : staffs) {
            System.out.println(staff.toString());
        }
    }

    public void changeStatusByIndex() {
        System.out.println("Nhập CMND");
        String idCard = scanner.nextLine();
        staffService.changeStatus1(idCard);
    }
}
