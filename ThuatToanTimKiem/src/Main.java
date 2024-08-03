public class Main {
    public static void main(String[] args) {
//        int[] arr = {5, 3, 4, 63, 34, -14, 0};
//        int index = linearSearch(arr, -14);
//        System.out.println("Ví trí là: " + index);
//        int index = linearSearch(arr, 344);
//        System.out.println("Ví trí là: " + index);

        int[] arr = {1, 4, 7, 10, 20, 43};
        int index = binarySearch(arr, 4);
        System.out.println("Vị trí là: " + index);
    }

    public static int binarySearch(int[] A, int K) {
        int left = 0, right = A.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == K) {
                return mid;
            }
            if (A[mid] < K) {
                left = mid + 1;
            }
            if (A[mid] > K) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int sentinelSearch(int[] A, int K) {
        A[A.length - 1] = K;
        int i = 0;
        while (A[i] != K) {
            i++;
        }
        if (i == A.length - 1) {
            return -1;
        }
        return i;
    }

    public static int linearSearch(int[] arr, int K) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == K) {
                return i;
            }
        }
        return -1;
    }
}