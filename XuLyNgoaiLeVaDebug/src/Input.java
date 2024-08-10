import java.util.Scanner;

public class Input {
    private Scanner input = new Scanner(System.in);

    public int inputNumber() {
        do {
            try {
                int number = Integer.parseInt(input.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }
        } while (true);
    }
}
// Ghép xử lý ngoại lệ vào bài quản lý, tập debug

class Main2 {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Nhập 1 số đi");
        int choice = input.inputNumber();
        System.out.println("Lựa chọn là: " + choice);
    }
}