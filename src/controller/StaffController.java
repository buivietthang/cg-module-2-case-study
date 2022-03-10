package controller;

import model.StaffFullTime;
import service.StaffService;
import view.StaffView;

public class StaffController {
    public static void menuManagerAdmin() {
        StaffView staffView = new StaffView();
        StaffService staffService = new StaffService();
        while (true) {
            int choice = staffView.menuAdmin();
            switch (choice) {
                case 1:
                    int choiceAdd = staffView.menuAdd();
                    switch (choiceAdd) {
                        case 1:
                            staffService.addStaff(staffView.createStaff(true));
                            break;
                        case 2:
                            staffService.addStaff(staffView.createStaff(false));
                            break;
                    }
                    break;

                case 2:
                    int index = staffService.findIndexByIdCard(staffService.inputIdCard());
                    if (index != -1) {
                        if (staffService.findAll().get(index) instanceof StaffFullTime) {
                            staffService.editStaff(index, staffView.createStaff(true));
                        } else {
                            staffService.editStaff(index, staffView.createStaff(false));
                        }
                    }
                    break;

                case 3:
                    int indexDelete = staffService.findIndexByIdCard(staffService.inputIdCard());
                    staffService.deleteStaff(indexDelete);
                    break;

                case 4:
                    staffView.showStaff(staffService.findAll());
                    break;

                case 5:
                    staffService.softByIdCard();
                    break;

                case 6:
                    staffView.changeStatusByIndex();
                    break;

                case 7:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void menuManagerUser() {
        StaffView staffView = new StaffView();
        StaffService staffService = new StaffService();
        while (true) {
            int choice = staffView.menuUser();
            switch (choice) {
                case 1:
                    int choiceAdd = staffView.menuUser();
                    switch (choiceAdd) {
                        case 1:
                            staffService.addStaff(staffView.createStaff(true));
                            break;
                        case 2:
                            staffService.addStaff(staffView.createStaff(false));
                            break;
                    }
                    break;
                case 2:
                    int index = staffService.findIndexByIdCard(staffService.inputIdCard());
                    if (index != -1) {
                        if (staffService.findAll().get(index) instanceof StaffFullTime) {
                            staffService.editStaff(index, staffView.createStaff(true));
                        } else {
                            staffService.editStaff(index, staffView.createStaff(false));
                        }
                    }
                    break;
                case 3:
                    int indexDelete = staffService.findIndexByIdCard(staffService.inputIdCard());
                    staffService.deleteStaff(indexDelete);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
