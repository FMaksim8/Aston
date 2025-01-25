import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList <T> {
    private Object[] array; //Массив для хранения элементов
    private int size; //Текущий размер массива

    //Конструктор, который создает массив размером 15
    public MyArrayList () {
        array = new Object[15]; //Создаем массив на 15 мест
        size = 0; //Начальный размер массива
    }

    //Метод для добавления нового элемента в конец списка
    public void add(T element) {
        ensureCapacity(); //Проверка, хватает ли мест для нового элемента
        array[size++] = element; //Добавление и увеличение размера на 1
    }

    //Метод для проверки, достаточно ли места в массиве
    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2); //Удвоение размера массива, если места не хватает
        }
    }

    //Метод для добавления элемента на определенную позицию
    public void add(int index, T element) {
        //Проверка на допустимость индекса
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс " + index + "не может быть отрицательными");
        }
        ensureCapacity(); //Проверка, хватает ли места
        System.arraycopy(array, index, array, index + 1, size - index);//Сдвиг элементов вправо
        array[index] = element; //Добавление элемента на нужную позицию
        size++;//Увеличение размера на 1
    }

    //Метод для получения элемента по индексу
    public T get(int index) {
        //Проверка на допустимость индекса
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс " + index + "не может быть отрицательными");
        }
        return (T) array[index];//Возвращение элемента по индексу
    }

    //Метод для удаления элемента по индексу
    public void remove (int index) {
        //Если индекс не корректный, показывает ошибку
        if (index < 0 || index >= size) { //Проверка индекса на корректность
            throw new IndexOutOfBoundsException( index + "Индекс вне допустимого значения");
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1); //Сдвиг элементов
        array[--size] = null; //Уменьшаем размер и обнуляем ссылку на удаленный элемент
    }

    //Метод для очищения списка
    public void clear () {
        Arrays.fill(array, 0, size, null); //Заполнение массив Null
        size = 0; //Устанавливаем размер на 0
    }

    //Метод для сортировки элементов в списке
    public void sort(Comparator<T> comparator) {
        //Запускаем быструю сортировку со всей длины массива
        quickSort(0, size - 1, comparator);
    }

    //Метод для реализации быстрой сортировки
    public void quickSort(int low, int high, Comparator<T> comparator) {
        if (low < high) {
            //разделяем массив на две части и сортируем каждую часть
            int index = part (low, high, comparator);
            quickSort(low, index - 1, comparator); //Сортируем левую часть, запустив этот же метод
            quickSort(index + 1, high, comparator); //Сортируем правую часть, запустив этот же метод
        }
    }

    //Метод для разделения массива на две части
    public int part (int low, int high, Comparator<T> comparator) {
        T pivot = (T) array[high]; // последний элемент для сортировки
        int i = low - 1;//Указатель для элементов (меньше последнего)
        for (int x = low; x < high; x++) {
            //Если текущий элемент меньше или равен последнему
            if (comparator.compare((T) array[x], pivot) <= 0) {
                i++; //Увеличиваем указатель меньших элементов
                swap(i, x); //Меняем местами элементы
            }
        }
        swap(i + 1, high); //Ставим последний элемент на его место
        return i + 1; //возвращаем индекс последнего элемента
    }

    //Метод для обмена местами двух элементов
    public  void  swap (int i, int x) {
        Object temp = array[i]; //временная переменная для обмена: передаем в нее значение первого элемента
        array[i] = array[x]; // на место первого элемента передаем значение второго элемента
        array[x] = temp; // на место второго элемента передаем значение первого элемента из временной переменной
    }

    //Метод для получения текущего размера массива
    public int size() {
        //возвращаем текущий размер
        return size;
    }
}





