public class ILoveJava {
    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void main(String[] args) {
        String string = "I love Java";
        StringBuilder newString = new StringBuilder(string);
        newString.reverse();
        System.out.println(newString);
    }
}
