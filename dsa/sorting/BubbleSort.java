package dsa.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 11, 2, 3, 1 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
