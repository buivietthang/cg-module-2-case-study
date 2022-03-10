package service;

import io.StaffReadAndWrite;
import model.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffService {
    private List<Staff> staffs = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public StaffService() {
        staffs = StaffReadAndWrite.readStaff();
    }

    // thêm nhân viên
    public void addStaff(Staff staff) {
        staffs.add(staff);
        StaffReadAndWrite.writeStaff(staffs);
    }

    // xóa nhân viên theo index
    public void deleteStaff(int index) {
        staffs.remove(index);
    }

    // sửa nhân viên theo index
    public void editStaff(int index, Staff staff) {
        staffs.set(index, staff);
        StaffReadAndWrite.writeStaff(staffs);
    }

    // tìm index theo CMND
    public int findIndexByIdCard(String idCard) {
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getIdCard().equals(idCard)) {
                return i;
            }
        }
        return -1;
    }

    // điền CMND
    public String inputIdCard() {
        System.out.println("Nhập CMND");
        return scanner.nextLine();
    }

    // hiển thị nhân viên
    public List<Staff> findAll() {
        return staffs;
    }

    // sắp xếp theo CMND
    public void softByIdCard() {
        SortByIdCard sortByIdCard = new SortByIdCard();
        staffs.sort(sortByIdCard);
        StaffReadAndWrite.writeStaff(staffs);
    }

    // thay đổi trạng thái
    public void changeStatus1(String idCard) {
        int index = findIndexByIdCard(idCard);
        staffs.get(index).changeStatus();
    }
}
