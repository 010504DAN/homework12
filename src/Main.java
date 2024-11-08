import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // b) Создаем массивы для списков A и B
        String[] listA = new String[5];
        String[] listB = new String[5];

        // b) Считываем строки для списка A
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            listA[i] = scanner.nextLine();
        }

        // Отображаем список A
        System.out.println("\nСписок A:");
        printArray(listA);

        // d) Считываем строки для списка B
        System.out.println("\nВведите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            listB[i] = scanner.nextLine();
        }

        // Отображаем список B
        System.out.println("\nСписок B:");
        printArray(listB);

        // e) Объединяем списки A и B в новый массив C
        String[] listC = new String[10];
        for (int i = 0; i < 5; i++) {
            listC[2 * i] = listA[i];       // A1, A2, A3, A4, A5
            listC[2 * i + 1] = listB[4 - i]; // B5, B4, B3, B2, B1
        }

        // f) Отображаем список C
        System.out.println("\nСписок C (объединенный):");
        printArray(listC);

        // g) Сортируем список C по длине строк методом пузырька
        bubbleSortByLength(listC);

        // Отображаем отсортированный список C
        System.out.println("\nСписок C (отсортированный по длине):");
        printArray(listC);
    }

    // Метод для вывода элементов массива
    private static void printArray(String[] array) {
        for (String str : array) {
            System.out.println(str);
        }
    }

    // Метод сортировки пузырьком по длине строки
    private static void bubbleSortByLength(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    // Меняем элементы местами
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
