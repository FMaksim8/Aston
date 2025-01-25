public class FlyMoon {
    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static void main(String[] args) {
        String str = "    fly me    to the moon    ";
        String new_str = str.replaceAll("\\s+", " ");
        String[] words = new_str.split(" ");
        int indexEnd = words.length - 1;
        int lengthLastWord = words[indexEnd].length();
        System.out.println(lengthLastWord);
    }
}
