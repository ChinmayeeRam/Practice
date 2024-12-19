public class SortBinaryArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 0, 1};

        System.out.println("Original Array:");
        printArray(arr);

        sortBinaryArray(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    private static void sortBinaryArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1) {
                left++;
            } else if (arr[right] == 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}