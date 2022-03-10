package io;

import model.Account;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountReadAndWrite {
    public static List<Account> readAccount() {
        try {
            FileInputStream fileInputStream = new FileInputStream("account.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Account> list = (List<Account>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return list;
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("Chưa có tài khoản, vui lòng đăng ký");
        }
        return new ArrayList<>();
    }

    public static void writeAccount(List<Account> list) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("account.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("Lỗi ở ghi file account");
        }
    }
}
