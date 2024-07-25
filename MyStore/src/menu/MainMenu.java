package menu;

import java.util.Scanner;

public class MainMenu {
    private CustomerMenu customerMenu = new CustomerMenu();
    private ProductMenu productMenu = new ProductMenu();

    Scanner inputNumber = new Scanner(System.in);
    public void selectMenu() {
        int choice;
        do {
            System.out.println("========= Trang chủ ==========\n" +
                    "1. Quản lý khách hàng\n" +
                    "2. Quản lý sản phẩm\n" +
                    "0. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    customerMenu.showMain();
                    break;
                case 2:
                    productMenu.showMain();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Không có lua chọn");
            }
        } while (choice != 0);
    }
}
