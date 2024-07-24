import menu.ProductMenu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductMenu productMenu = new ProductMenu();
        productMenu.showMain();
    }
}

        /*
        // kiểu wrapper (Lớp): có phuương thức ~ kiểu nguyên thủy
        // Integer ~ int, Double - double, Character ~ char,...
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(13);
        for (Integer item: list) {
            System.out.println(item);
        }
        System.out.println("Phần tử số 0: " + list.get(0));
//        list.remove(1);
        list.set(1, 112);
        System.out.println("Mảng sau xóa: ");
        for (Integer item: list) {
            System.out.println(item);
        }
        System.out.println("Hello world!");

         */