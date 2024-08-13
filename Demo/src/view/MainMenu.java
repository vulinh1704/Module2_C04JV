package view;

import input.Input;

public class MainMenu {
    private CategoryMenu categoryMenu = new CategoryMenu();
    private ProductMenu productMenu = new ProductMenu();
    public void showMainMenu() {
        int choice;
        do {
            System.out.println("========= Menu chính ============");
            System.out.println("1. Quản lý sản phẩm");
            System.out.println("2. Quản lý loại sản phẩm");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng nhập lựa chon: ");
            choice = Input.inputNumber();
            switch (choice) {
                case 1:
                    productMenu.showMainProMenu();
                    break;
                case 2:
                    categoryMenu.showMainCateMenu();
                    break;
            }
        } while (choice != 0);
    }
}
