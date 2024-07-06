import java.util.Scanner;

public class Demo { // Tên class để public thì phải trùng với tên file
    // Phím tắt tạo hàm main: main + tab || psvm + tab
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("Giá trị của a là : %d", a);
        // Tát cả các lệnh trong Java bắt buộc kết thúc bằng ;
        /*
        Các kiểu dữ liệu:
        số nguyên(int): 0,1,-1,-20,
        so nguyen(long): > int > short > byte
        số thực(double): 1.5, 7.5, 11.0,
        số thực(float): 1.5f, 5.3f,
        Kiểu logic(boolean): true/false,
        Kiểu chuỗi (String): "Linh", "C04JV",
        Kiểu ký tự - character (char): 'a', 'b', '1'
         // <Kiểu dữ liệu> name = <giá trị>;
        int age = 10;
        float score = 10.5f;
        double a = 10.4;
        String name = "Vũ Linh";
        char character = 'r';
        boolean isSick = true;
        // In ra: sout + tab
        System.out.println(age);
         */

        // Format code: Ctrl + Alt + L

        /*
        Các loại toán tử:
        - Toán tử số học: +, -, * , \, %, ++, --
        - Toán tử logic: || , &&, !
        - Toán tử so sánh: == , != , >, >=, <=, <

        ** Câu lệnh điều kiện:
        - các điều kiện bắt buộc phải có kiểu dữ liệu là boolean
        --------------------------------------
        if(<điều kiện>) {
            <Khối lệnh thực thi khi đk true>
        }
        -------------------------------------------
        if(<điều kiện>) {
            <Khối lệnh thực thi khi đk true>
        } else {
            Khối lệnh thực thi khi đk false>
        }
        -------------------------------------------
        if(<điều kiện 1>) {
            <Khối lệnh thực thi khi đk1 true>
        } else if(<điều kiện 2>) {
            Khối lệnh thực thi khi đk1 false và dk2 true>
        } else if(<điều kiện 3>) {
            ...
        } else {
            ...
        }

        ** Switch - case
        int choose = 1;
        switch (choose) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hi");
                break;
            default:
                System.out.println("Default");
                break;
        }
         */

        /*
        // Nhập xuất dữ liệu trong Java;
        --------------------------------
        ** Xuất dữ liệu
        String name = "Vũ Linh";
        System.out.println("Linh có tuổi là " + 10 + " có tên là: " + name);
        System.out.println("Hehe");
        // System.out.print("Hello");
        // System.out.print("Hả");
        // System.out.printf(); // Tìm hiểu thêm


        --------------------------------
        ** Nhập dữ liệu
        Scanner input = new Scanner(System.in); // Đại diện cho nơi nhập dữ liệu (Sytem.in: lâ dữ liệu từ bàn phím)
        System.out.println("Vui lòng nhập: ");
        // int a = input.nextInt(); // Gọi phương thức để nhập số
        // double a = input.nextDouble();
        // boolean a = input.nextBoolean();
        String a = input.nextLine(); // Nhập chuỗi
        System.out.println("Số bạn nhập là: " + a);

        ------------------------------------------------
        Scanner input = new Scanner(System.in);
        // [BUG]: Nhập số (next... khác nextLine) trước nextLine thì sẽ lỗi
        // Cách fix: Nhập chữ trước nhập số || thêm một cái nextLine ở giữa || Tạo 2 input khác nhau (số 1 cái, chữ 1 cái)
        System.out.println("Nhập số: ");
        int number = input.nextInt(); // 50 + Enter
        input.nextLine();
        System.out.println("Nhập text: ");
        String text = input.nextLine(); // "" + Enter
        System.out.println("Text: " + text);
        System.out.println("Number: " + number);

         */

        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = inputNumber.nextInt();
        System.out.println("Nhập text: ");
        String text = inputString.nextLine(); // ""
        System.out.println("Text: " + text);
        System.out.println("Number: " + number);

    }
}
