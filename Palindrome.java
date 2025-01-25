public class Palindrome {
    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static void main(String[] args) {
        String str = "112211";

        int left = 0;
        int right = str.length() - 1;

        boolean step = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                step = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(step);
    }
}
