package controller;

import model.Account;
import service.AccountService;
import view.LoginView;

public class LoginController {
    public static void menuLogin() {
        LoginView loginView = new LoginView();
        AccountService accountService = new AccountService();

        while (true) {
            try {
                int choice = loginView.menuLogin();
                switch (choice) {
                    case 1:
                        Account account = loginView.createUser();
                        if (accountService.loginAdmin(account)) {
                            System.out.println("Chào mừng Admin");
                            StaffController.menuManagerAdmin();
                            break;
                        }
                        if (accountService.loginUser(account)) {
                            System.out.println("Chào mừng bạn");
                            StaffController.menuManagerUser();
                            break;
                        }
                    case 2:

                        accountService.addAccount(loginView.createUser());
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.err.println("Nhập chưa chính xác");
                }
            } catch (Exception e) {
                System.err.println("Nhập chưa chính xác");
                menuLogin();
            }
        }
    }
}
