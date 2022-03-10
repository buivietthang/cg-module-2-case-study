package validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaffValidate {
    static Scanner scanner = new Scanner(System.in);

    public static String nameValidate() {
        String regex = "^[a-z]{2,10}$";
        System.out.println("Nhập tên (từ 2 đến 10 chữ cái viết thường)");
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            return name;
        }
        System.out.println("Không hợp lệ");
        return nameValidate();
    }

    public static int ageValidate() {
        System.out.println("Nhập tuổi (Từ 18 đến 60)");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            if (age >= 18 && age <= 60) {
                return age;
            } else {
                System.out.println("Không hợp lệ");
                return ageValidate();
            }
        } catch (Exception e) {
            System.out.println("Không hợp lệ");
            return ageValidate();
        }
    }

    public static String idCardValidate() {
        String regex = "^[0-9]{4}$";
        System.out.println("Nhập CMND (4 số)");
        String idCard = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(idCard);
        if (matcher.find()) {
            return idCard;
        }
        System.out.println("Không hợp lệ");
        return idCardValidate();
    }

    public static String emailValidate() {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        System.out.println("Nhập email (abc@xyz)");
        String email = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            return email;
        }
        System.out.println("Không hợp lệ");
        return emailValidate();
    }
}
