import java.io.*;
import java.util.Scanner;

public class Main {
    /*
    public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
        System.out.println("Hello world!");
        FileInputStream fileInputStream = new FileInputStream("hello");
    }

     public static void main(String[] args) {
        try {
            System.out.println("Hello world!");
            FileInputStream fileInputStream = new FileInputStream("hello");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("1");
        throwError();
    }

    public static void throwError() throws Exception {
        throw new Exception("Hehe");
    }
     */

    /*
    int a;
    public static void main(String[] args) {
//        Main main = null;
//        int[] a = new int[10];
//        System.out.println(a[11]);
 //        System.out.println(main.a);
//        System.out.println(3 / 0); // Unchecked Exception
        Scanner scanne = new Scanner(System.in);
        int a = scanne.nextInt();
    }

     */

    public static void main(String[] args) {
        try { // Khối chứa các thành phần có thể sinh ra exception
            Scanner scanner = new Scanner(System.in);
            int a = 10;
            System.out.println("Nhp so");
            int b = scanner.nextInt();
            int c = a / b; // ArithmeticE... : Khi gặp ngoại lệ ngay lập tức dừng khối code trong khôi try và đưa ngoại lệ cho catch xử lý
            System.out.println(c);
        } catch (ArithmeticException e) { // Đối tượng ngoại lệ sinh ra nếu đoạn code trên tung ra ngoại lệ
            System.out.println("Lỗi toán học"); // Trong khối catch là đoạn code xử lý khi gặp ngoại le
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi nhập dữ liệu");
        } catch (Exception e) {
            System.out.println("Lỗi gì đó");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Hello");
    }
}
// Cho người dùng nhập vào dữ liệu và xử lý tat ca ngoại lệ

/*
 Catch:
 - Có thể sử dụng nhiều khoi catch
 - Các đối tượng của catch bên dưới phải là đối tượng của lớp con hoặc 1 không liên quan

 Finally: Là khối chắc chắn sẽ chạy dù có ngoại lệ hay không (thường sử dụng trong trường hợp đóng kết nối hoặc trường hợp bắt buộc nào đó
 */

/*
Ngoại lệ trong Java bản chất là các đối tượng mà chương tung ra trong quá trình phát triển

Checked Exception: Là các ngoại le sẽ dc kiểm tra trong trong trình biên dịch, yêu cầu phải xử lý khi biên dịch

throws: (ném) thường dùng sau tên hàm và có nhiệm vụ khai báo danh sách các exception có the sinh ra;
throw: thường sử dụng trong hàm, sử dụng để ném ra ngoại lệ. (thường được sử dụng để custom ngoại lệ theo dự án)

UnChecked Exception: Là các các ngoại sinh ra trong quá runtime.
VD: ArithmeticException (Toán học), NullPointException,ArrayIndexOutOfBoundsException, InputMismatchException, ....
 */