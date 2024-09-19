public class MonotonicArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3};
        int[] array2 = {6, 5, 4, 4};
        int[] array3 = {1, 3, 2};

        System.out.println("Array 1 is monotonic: " + isMonotonic(array1));
        System.out.println("Array 2 is monotonic: " + isMonotonic(array2));
        System.out.println("Array 3 is monotonic: " + isMonotonic(array3));
    }

    public static boolean isMonotonic(int[] array) {
        if (array.length <= 1) return true;

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                decreasing = false;
            } else if (array[i] < array[i - 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}

