/**
 * Класс содержит методы для добавления, редактирования, удадения записей в
 * блокнот и вывода их на печать
 */
public class NotepadEntry {

    /**
     * Размер блокнота
     */
    String[] arr = new String[10];

    /**
     * Функция добавления записи в блокнот
     *
     * @param s Принимает значение типа String (запись, которая вставится в
     *          свободное место блокнота. Если размер блокнота превышен, то выведется
     *          сообщение об ошибке
     */
    void addEntry(String s) {
        int i = 0;

        for (; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = s;
                break;

            } else if (arr[arr.length - 1] != null) {
                System.out.println("Массив заполнен. Запись \"" + s + "\" не внесена");
                break;
            }
        }
    }

    /**
     * Функция удаления записи из блокнота
     *
     * @param i Принимает значение типа int (индекс элемента массива)
     * @param s Принимает значение типа String
     */
    void deleteEntry(int i, String s) {
        arr[i] = null;
    }

    /**
     * Функция редактирования записи в блокноте
     *
     * @param i Принимает значение типа int (индекс элемента массива)
     * @param s Принимает значение типа String (записи, которая вставится на
     *          место редактируемой)
     */
    void editEntry(int i, String s) {
        arr[i] = s;

    }

    /**
     * Функция вывода всех записей блокнота
     */
    void viewAllEntries() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}