package view;

import input.Input;
import manager.CategoryManage;
import model.Category;

import java.util.List;

public class CategoryMenu {
    private CategoryManage categoryManage = new CategoryManage();
    public void showMainCateMenu() {
        int choice;
        do {
            System.out.println("========= Menu chính ============");
            System.out.println("1. Thêm mới");
            System.out.println("2. Hiển thị tất cả ");
            System.out.println("0. Thoát");
            System.out.println("Vui lòng nhập lựa chon: ");
            choice = Input.inputNumber();
            switch (choice) {
                case 1:
                    showAddMenu();
                    break;
                case 2:
                    showAllMenu();
                    break;
            }
        } while (choice != 0);
    }

    public void showAddMenu() {
        System.out.println("========== Thêm loại sản phẩm ========== ");
        System.out.println("Nhập id: ");
        int id = Input.inputNumber();
        System.out.println("Nhập tên: ");
        String name = Input.inputString();
        Category category = new Category(id , name);
        categoryManage.add(category);
        System.out.println("Them thanh cong");
    }

    public void showAllMenu() {
        List<Category> categoryList = categoryManage.getAll();
        for(Category c: categoryList) {
            System.out.println(c);
        }
    }
}
