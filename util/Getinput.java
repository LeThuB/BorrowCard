package BorrowCard.util;

import java.time.LocalDate;
import java.util.Scanner;

public class Getinput {
    public static String getString(Scanner scanner, String suggestion, int minlength, int maxlength) {
        do {
            System.out.println(suggestion);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Vui long khong de trong");
            } else if (input.length() >= minlength && input.length() <= maxlength) {
                return input;
            } else {
                System.out.println("Do dai phai trong khoang tu " + minlength + "den " + maxlength);
            }
        } while (true);

    }

    public static int getInt(Scanner scanner, String suggestion, int min, int max) {
        do {
            try {
                System.out.println(suggestion);
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println("Vui long nhap so nguyen tu " + min + "den " + max);

            } catch (Exception e) {
                System.out.println("Vui long nha 1 so nguyen");
            }

        } while (true);
    }

    public static LocalDate getLocalDate(Scanner scanner, String suggestion) {
        do {

            try {
                System.out.println(suggestion);
                return LocalDate.parse(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Vui long nhap dinh dang ngay dd-MM-yyyy");
            }
        } while (true);
    }

}
