import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14, 30, 15};
        insertSort(arr);
//        bubbleSort(arr);
//        selectionSort(arr);
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                // Kiếm tra phần tử tại vị trí i với các phần tử trước đó nếu sai thì đổi chỗ
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i; // minIndex: đại diện cho vị trí của phần tử nhỏ nhất

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Tìm vị trí của phần tử nhỏ nhất trong day chưa sắp xếp
                }
            }

            int temp = arr[i]; // đổi chỗ phần tử nhỏ nhất với vị trí đầu dãy chưa được sắp xếp
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


// Cơ chế selection sort là chọn phần tử nhỏ nhất trong dãy chưa được sắp xếp đưa về phần đầu mảng

// Cơ chế sắp xếp chèn là đưa phần tử được xét về đúng vị của nó