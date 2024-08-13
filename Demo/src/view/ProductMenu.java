package view;

import input.Input;
import manager.CategoryManage;
import manager.ProductManage;
import model.Category;
import model.Product;

import java.util.List;

public class ProductMenu {
    private ProductManage productManage = new ProductManage();
    private CategoryManage categoryManage = new CategoryManage();

    public void showMainProMenu() {
        int choice;
        do {
            System.out.println("========= Menu chính sản phẩm ============");
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
        System.out.println("========== Thêm sản phẩm ========== ");
        System.out.println("Nhập id: ");
        int id = Input.inputNumber();
        System.out.println("Nhập tên: ");
        String name = Input.inputString();
        System.out.println("Nhập giá: ");
        double price = Input.inputNumber();
        System.out.println("Danh sách loại sản phẩm");
        List<Category> categoryList = categoryManage.getAll();
        for (int i = 0; i < categoryList.size(); i++) {
            System.out.println(i + 1 + "." + categoryList.get(i).getName()); // 1. Bánh
        }
        System.out.println("Vui lòng chon loại: ");
        int choiceIndexCate = Input.inputNumber();
        int indexCate = choiceIndexCate - 1;
        int categoryId = this.getIdCate(indexCate);
        Product product = new Product(id, name, price, categoryId);
        productManage.add(product);
        System.out.println("Thêm thành công");
    }

    private int getIdCate(int index) {
        List<Category> categoryList = categoryManage.getAll();
        Category category = categoryList.get(index);
        return category.getId();
    }

    public void showAllMenu() {
        List<Product> list = productManage.getAll();
        for (Product p : list) {
            Category category = categoryManage.findById(p.getCategoryId());
            System.out.println(p + ", category: " + category.getName());
        }
    }
}
