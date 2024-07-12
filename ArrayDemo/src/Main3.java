import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int size = 0; // Số lượng phần tử thực có trong mảng
        int[] numbers = new int[10]; // length = 10 Số lượng tối đa mà maảng có thể chứa
        size = addElement(numbers, size, 11);
        showArray(numbers, size);
        System.out.println("Size: " + size);

        size = addElement(numbers, size, 15);
        showArray(numbers, size);
        System.out.println("Size: " + size);

        int index = findElement(numbers, 15, size);
        System.out.println("----------------------");
        System.out.println("Vị trí của 15 là: " + index);

        size = addElement(numbers, size, 20);
        showArray(numbers, size);
        System.out.println("Size: " + size);

        size = inertElement(numbers,-21, 1, size);
        System.out.println("Mảng sau chèn");
        showArray(numbers, size);
        System.out.println("Size: " + size);


//        size = removeElement(numbers, 15, size);
//        System.out.println("========= Mảng sau xóa ============");
//        showArray(numbers, size);
//        System.out.println("Size: " + size);
    }

    public static int inertElement(int[] array, int element, int indexInsert, int size) {
        for (int i = size; i > indexInsert; i--) {
            array[i] = array[i - 1];
        }
        array[indexInsert] = element;
        size++;
        return size;
    }


    public static int removeElement(int[] array, int element, int size) {
        int index = findElement(array, element, size);
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return size;
    }

    public static int findElement(int[] array, int element, int size) {
        for (int i = 0; i < size; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int addElement(int[] array, int size, int newElement) {
        array[size] = newElement;
        size++;
        return size;
    }


    public static void showArray(int[] array, int size) {
        System.out.println("==================");
        System.out.println("Phần tử trong mảng: ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }


}
