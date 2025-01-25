import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Создаем список строк
        MyArrayList<String> stringList = new MyArrayList<>();

        //Добавляем строки в список
        stringList.add("Яблоко");
        stringList.add("Масло");
        stringList.add("Печенье");
        stringList.add("Шоколад");

        //Показываем содержимое списка
        System.out.println("Список после добавления строк: ");
        printList(stringList); //Метод для вывода элемента списка

        //Выводим Ананас по 2 индекс
        stringList.add(2, "Ананас");
        System.out.println("\nСписок после добавления 'Ананас' - индекс 2");
        printList(stringList); //показываем список

        //Получаем первый элемент списка
        String firstElement = stringList.get(0);
        System.out.println("\nПервый элемент списка: " + firstElement);

        //Удаляем Печенье по 3 индексе
        stringList.remove(3);
        System.out.println("Список после удаления элемента - индекс 3");
        printList(stringList); //Выводим обновленный список

        //Очищаем весь список
        stringList.clear();
        System.out.println("\nСписок после очищения:");
        printList(stringList); //Выводим пустой список


        //Создаем новый список для чисел
        MyArrayList<Integer> inList = new MyArrayList<>();
        Random random = new Random(); // Для генерации случайных чисел

        //Заполняем список случайными числами от 1 до 1000
        for (int i = 0; i < 1000; i++) {
            int randomNubmer = random.nextInt(1000) + 1; //генерируем случайные числа
            inList.add(randomNubmer); //добавляем в список
        }

        //Показываем список целых чисел
        System.out.print("Список целых чисел: ");
        printList(inList);//Выводим список чисел

        //Сортируем список
        inList.sort(Comparator.naturalOrder());
        System.out.print("Список целых чисел после сортировки: ");
        printList(inList);//Выводим отсортированный список
    }

    //Метод для вывода списка
    public static void printList (MyArrayList<?> list) {
        for (int i = 0; i < list.size(); i++){ //Проходим по всем элементам списка
            System.out.print(list.get(i)); //Выводим текущий элемент
            if (i < list.size() -1) { //Если это не последний элемент
                System.out.print(" "); //Отступ между элементами
            }
        }
        System.out.println(); //Пустая строка
    }
}
