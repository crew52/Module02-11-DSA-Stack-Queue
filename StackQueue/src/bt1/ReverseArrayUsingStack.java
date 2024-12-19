package bt1;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        printArray(array);

        // Đảo ngược mảng
        reverseArray(array);

        System.out.println("Mảng sau khi đảo ngược:");
        printArray(array);
    }

    // Hàm đảo ngược mảng sử dụng Stack
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Đưa tất cả phần tử của mảng vào Stack
        for (int num : array) {
            stack.push(num);
        }

        // Lấy phần tử từ Stack và gán lại vào mảng
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    // Hàm in mảng
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
