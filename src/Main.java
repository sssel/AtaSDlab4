import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "Bkss";
        String s2 = "Bks";
        System.out.println(s1.compareTo(s2));
        Student[] students = new Student[10];
        students[0] = new Student("Krutov", "Dmitry", 110, "FKKPI");
        students[1] = new Student("Krutov", "Dmitry", 210, "FKKPI");
        students[2] = new Student("Krutov", "Dmitry", 150, "FKKPI");
        students[3] = new Student("Krutov", "Dmitry", 410, "FKKPI");
        students[4] = new Student("Kovalenko", "Dmitry", 226, "FKKPI");
        students[5] = new Student("Krutov", "Dmitry", 226, "FKKPI");
        students[6] = new Student("Bronson", "Dmitry", 226, "FKKPI");
        students[7] = new Student("Krutov", "Dmitry", 154, "FKKPI");
        students[8] = new Student("Johnson", "Dmitry", 444, "FKKPI");
        students[9] = new Student("Andreev", "Dmitry", 444, "FKKPI");
        print(students);
        sortByIndex(students);
        System.out.println("Відсортовано: ");
        print(students);

    }

    public static void insertionSort(Student[] stud, int size) {
        for (int i = 1; i < size; i++) {
            Student element = stud[i];
            int j = i - 1;
            while (j >= 0 && (stud[j].GroupNumber > element.GroupNumber)) {
                stud[j + 1] = stud[j];
                j--;
            }
            stud[j + 1] = element;
        }
    }

    public static void sortByIndex(Student[] students) {
        int size = students.length;
        int[] index = new int[size];
        for (int i = 0; i < size; i++) {
            index[i] = i;
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                double mark1 = students[index[i]].GroupNumber;
                double mark2 = students[index[j]].GroupNumber;
                if (mark1 > mark2) {
                    int temp = index[i];
                    index[i] = index[j];
                    index[j] = temp;
                }
                if (mark1 == mark2) {
                    String markSurename1 = students[index[i]].Surname.toUpperCase();
                    String markSurename2 = students[index[j]].Surname.toUpperCase();
                    if (markSurename1.compareTo(markSurename2) > 0) {
                        int temp = index[i];
                        index[i] = index[j];
                        index[j] = temp;
                    }
                }
            }
        }
        Student[] temp = new Student[size];
        for (int i = 0; i < size; i++) {
            temp[i] = students[index[i]];
        }
        for (int i = 0; i < size; i++) {
            students[i] = temp[i];
        }
    }

    public static void print(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }
}