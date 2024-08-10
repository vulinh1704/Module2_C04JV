import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ProductManage productManage = new ProductManage();
//        Product product = new Product(1, "Kẹo");
//        Product product1 = new Product(2, "Bánh");
//        productManage.add(product);
//        productManage.add(product1);
        List<Product> productList = productManage.getProductList();
        for (Product p: productList) {
            System.out.println(p);
        }




        /*
        Lớp file sử dụng để thao tác với file (thêm, xóa, kiểm tra ...)
        File file = new File("data.txt"); // Khai báo file
        file.createNewFile(); // Phương thức tạo file
        //file.delete(); // Xóa file
        System.out.println(file.exists());
         File folder = new File("c04Jv");
        folder.mkdir();
        File file = new File("c04Jv/data.txt");
        file.createNewFile();
         */
//        File file = new File("data/c04.txt");
//        // Đọc dữ liệu từ file
//        FileReader fileReader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }


        /*
        //Ghi dữ liệu vào file
        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("Hello C04");
        bufferedWriter.close();
         */

    }
}