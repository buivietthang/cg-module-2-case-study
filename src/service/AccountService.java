package service;

import io.AccountReadAndWrite;
import model.Account;

import java.util.List;

public class AccountService {
    List<Account> accounts = AccountReadAndWrite.readAccount();

    public AccountService() {
    }

    public void addAccount(Account account) {
        for (Account account1 : accounts) {
            if (account1.getUsername().equals(account.getUsername())) {
                return;
            }
        }
        accounts.add(account);
        AccountReadAndWrite.writeAccount(accounts);
    }

    public boolean loginUser(Account account) {
        for (Account account1 : accounts) {
            if (account1.getPassword().equals(account.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public boolean loginAdmin(Account account) {
        if ("Admin".equals(account.getUsername()) && "Admin".equals(account.getPassword())) {
            return true;
        }
        return false;
    }
}
