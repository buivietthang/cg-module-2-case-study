package io;

import model.Staff;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StaffReadAndWrite {
    public static List<Staff> readStaff() {
        try {
            FileInputStream fileInputStream = new FileInputStream("staff.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Staff> list = (List<Staff>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return list;
        } catch (Exception e) {
//            e.printStackTrace();
//            System.err.println("Chưa có nhân viên để hiển thị");
        }
        return new ArrayList<>();
    }

    public static void writeStaff(List<Staff> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("staff.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("Lỗi ở ghi file staff");
        }
    }
}
