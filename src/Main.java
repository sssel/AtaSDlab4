public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Dmitry", "Krutov", 110, "FKKPI");
        students[1] = new Student("Dmitry", "Krutov", 210, "FKKPI");
        students[2] = new Student("Dmitry", "Krutov", 150, "FKKPI");
        students[3] = new Student("Dmitry", "Krutov", 410, "FKKPI");
        students[4] = new Student("Dmitry", "Krutov", 225, "FKKPI");
        students[5] = new Student("Dmitry", "Krutov", 226, "FKKPI");
        students[6] = new Student("Dmitry", "Krutov", 230, "FKKPI");
        students[7] = new Student("Dmitry", "Krutov", 154, "FKKPI");
        students[8] = new Student("Dmitry", "Krutov", 443, "FKKPI");
        students[9] = new Student("Dmitry", "Krutov", 444, "FKKPI");
        print(students);
        insertionSort(students, students.length);
        System.out.println("Відсортовано: ");
        print(students);

    }
    public static void insertionSort(Student[] stud, int size){
        for(int i = 1; i < size; i++) {
            Student element = stud[i];
            int j = i - 1;
            while (j >= 0 && (stud[j].GroupNumber > element.GroupNumber)) {
                stud[j + 1] = stud[j];
                j--;
            }
            stud[j+1]=element;
        }
    }
    public static void print(Student[] students){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }
}