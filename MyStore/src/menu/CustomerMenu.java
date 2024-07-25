package menu;

import manager.CustomerManager;

import java.util.Scanner;

public class CustomerMenu {
    private CustomerManager customerManager;
    Scanner inputNumber = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMain() {
        int choice;
        do {
            System.out.println("========= Menu quản khachs hang ==========\n" +
                    "1. Thêm mới\n" +
                    "2. Sửa\n" +
                    "3. Xóa\n" +
                    "4. Hiển thị tất cả\n" +
                    "5. Tìm tên gần đúng\n" +
                    "0. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 0:
                    break;
                default:
                    System.out.println("Không có lua chọn");
            }
        } while (choice != 0);
    }
}
