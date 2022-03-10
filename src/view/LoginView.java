package view;

import model.Account;

import java.util.Scanner;

public class LoginView {
    Scanner scanner = new Scanner(System.in);

    public int menuLogin() {
        System.out.println("||         WELCOME        ||");
        System.out.println("||      1. Đăng nhập      ||");
        System.out.println("||      2. Đăng ký        ||");
        System.out.println("||      3. Thoát          ||");
        return Integer.parseInt(scanner.nextLine());
    }

    public Account createUser() {
        System.out.println("||      Nhập tên tài khoản      ||");
        String username = scanner.nextLine();
        System.out.println("||      Nhập mật khẩu           ||");
        String password = scanner.nextLine();
        return new Account(username, password);
    }
}
