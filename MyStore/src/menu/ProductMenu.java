package menu;

import manager.ProductManager;
import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMenu {
    ProductManager productManager = new ProductManager();
    Scanner inputNumber = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMain() {
        int choice;
        do {
            System.out.println("========= Menu quan ly san pham ==========\n" +
                    "1. Thêm mới\n" +
                    "2. Sửa\n" +
                    "3. Xóa\n" +
                    "4. Hiển thị tất cả\n" +
                    "5. Tìm tên gần đúng\n" +
                    "0. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    showMenuList();
                    break;
                case 5:
                    showFormSearchByName();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Không có lua chọn");
            }
        } while (choice != 0);
    }

    public void showFormSearchByName() {
        System.out.println("============= Tìm kiếm theo teen ============ ");
        System.out.println("Nhập tên cần tìm: ");
        String name = inputString.nextLine();
        ArrayList<Product> productArrayList = productManager.findByNameContain(name);
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(i + 1 + ". " + productArrayList.get(i));
        }
    }

    public void showMenuEdit() {
        System.out.println("============= Menu sửa ============");
        System.out.println("Nhập Id Sửa: ");
        int id = inputNumber.nextInt();
        /*
        boolean isCheck = findById();
        if(isCheck == false) {
            System.out.println("Không có");
            return;
        }
         */
        System.out.println("Nhập tên Sửa: ");
        String name = inputString.nextLine();
        System.out.println("Nhập giá giá: ");
        double price = inputNumber.nextDouble();
        Product newProduct = new Product(id, name, price);
        productManager.edit(id, newProduct);
        System.out.println("Sửa sản phẩm thành công!");
    }

    public void showMenuDelete() {
        System.out.println(" ================ Menu xóa =============");
        System.out.println("Nhập id sản phẩm: ");
        int idDelete = inputNumber.nextInt();
        productManager.delete(idDelete);
        System.out.println("Xóa sản phẩm thành công.");
    }

    public void showMenuList() {
        System.out.println(" ============ Danh sách sản phẩm =========");
        ArrayList<Product> listProduct = productManager.findAll();
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(i + 1 + ". " + listProduct.get(i));
        }
    }

    public void showMenuAdd() {
        System.out.println("============= Menu thêm mới ============");
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập giá: ");
        double price = inputNumber.nextDouble();
        Product newProduct = new Product(name, price);
        productManager.add(newProduct);
        System.out.println("Thêm sản phẩm thành công!");
    }


//    public static void main(String[] args) {
//        ProductManager productManager = new ProductManager();
//        Product product = new Product(1, "Bánh", 10);
//        Product product2 = new Product(2, "Kẹo", 12);
//        productManager.add(product);
//        productManager.add(product2);
//
//        ArrayList<Product> listProduct = productManager.findAll();
//        for(Product item: listProduct) {
//            System.out.println(item);
//        }
//    }

    // Tìm kiếm theo tên gần đúng, khoảng giá, theo id
    // Create, Update, Delete, Read
}
