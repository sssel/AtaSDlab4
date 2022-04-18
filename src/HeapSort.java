// Реализация пирамидальной сортировки на Java
public class HeapSort {
    public void sort(Student[] students) {
        int n = students.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(students, n, i);

        // Один за другим извлекаем элементы из кучи   
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            Student temp = students[0];
            students[0] = students[i];
            students[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(students, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
    void heapify(Student[] students, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && students[l].GroupNumber > students[largest].GroupNumber)
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && students[r].GroupNumber > students[largest].GroupNumber)
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i) {
            Student swap = students[i];
            students[i] = students[largest];
            students[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(students, n, largest);
        }
    }
}