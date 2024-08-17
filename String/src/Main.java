import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);

    public static String validateEmail() {
        String regexEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        do {
            System.out.println("Nhập dữ liệu");
            String data = input.nextLine();
            if(data.matches(regexEmail)) { // matches: Hàm có sẵn string dùng để so khớp chuỗi trong Java
                return data;
            } else {
                System.out.println("Sai định dạng, vui lòng nhập lại (test@gmail.com)");
            }
        } while (true);
    }
    public static void main(String[] args) {
        String email = validateEmail();
        System.out.println("Email: " + email);
        // Hoàn thành nốt phần bài hôm trước và ghép validate dữ liệu như mẫu trên.

        /*
        String a = "Hello";
        // String là 1 kiểu dữ liệu đặc biệt, tương tác với chuooix trong java ( o phải là kdl nguyên thủy)
        // String là 1 lớp được cấu tạo từ 1 mảng các char.
        char[] b = {'H', 'l', 'l', '0'};
        String c = new String(b); // Cách khởi tại khác của 1 chuỗi
        String d = new String("Hll0");
        String e = "Hllo";

        // 2 Lớp khác giúp khởi tạo chuỗi: StringBuilder, StringBuffer
        StringBuffer s = new StringBuffer("Hello");

        - String trong java thì là immutable
        String b = "Hehe";
        b = "Hehe1";

        MutableDemo mutableDemo = new MutableDemo("Linh", 22);
        mutableDemo.setName("Meèo");
        System.out.println(mutableDemo.getName());

        ImMutableDemo i = new ImMutableDemo("Haha");
        System.out.println(i.getName());

        String name = "linh";
        name.toUpperCase(); // LINH
        System.out.println(name); // linh
        StringBuffer và StringBuilder thì là mutable
         StringBuffer s = new StringBuffer("linh");
        s.append(" lớp c04");
        System.out.println(s);

        String là lớp final (kHÔNG cho lớp con kế thừa)
        String vừa có tính nguyên thủ vừa có tính đối tượng

        String s1 = "Hello";          	// String literal
        String s2 = "Hello";          	// String literal
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
//        String s3 = s1;
//        // Cùng tham chiếu (trỏ tới cùng một vị trí)
//        String s4 = new String("Hello");  // String Object: Tạo mới một đối tượng String
//        String s5 = new String("Hello");  // Tạo mới một đối tượng String
//        System.out.println(s4 == s5);

// Tất cả các hàm tương tác với chuỗi trong String thì không làm thay đổi giá trị ban đầu
        // Các phương thức cơ bản của string.
        String a = "Hehefadsd";
        String b = "H";
        String c = "               A           B            ";
        System.out.println(a.contains(b)); // Kiểm tra 1 chuỗi xem có nằm trong chuỗi khác hay khôn
        System.out.println(a.toUpperCase()); // Trả về chữ in hoa
        System.out.println(a.charAt(3)); // Tìm kts tự theo vị trí
        System.out.println(a.indexOf('f')); // Trả về vị trí của ký tự nằm trong dãy.
        System.out.println(c.trim()); // Xóa các ký tự tắng ở 2 đầu
        System.out.println(c.length()); // Trả vè số lượng ký tự trong chuỗi

        // Regex trong Java: Là mẫu chuỗi dùng để dịnh dang chuỗi theo ý muốn.

        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String email = "linh@gmai.com";
        if(email.matches(regex)) {
            System.out.println("Email matches");
        } else  {
            System.out.println("Not matches");
        }
         */
    }


}