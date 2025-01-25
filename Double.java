import java.util.HashSet;

public class Double {
    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void main(String[] args) {

        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        getDistinctNumbers(ints);
    }

    public static void getDistinctNumbers(int[] ints) {
        HashSet<Integer> distinctNumbers = new HashSet<>();

        for (int num : ints) {
            distinctNumbers.add(num);

        }
        System.out.println("Числа ");
        for (int num : distinctNumbers){
            System.out.println(num);

        }

    }
}
