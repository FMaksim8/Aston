public class getDistinctNumbers {
    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        int max = 0;
        int max2 = 0;

        if (arr[0] > arr[1]) {
            max = arr[0];
            max2 = arr[1];
        } else {
            max = arr[1];
            max2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
