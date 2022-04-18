public class Student {
    String Surname;
    String Name;
    int GroupNumber;
    String Faculty;

    Student(String Surname, String Name, int GroupNumber, String Faculty){
        this.Surname = Surname;
        this.Name = Name;
        this.GroupNumber = GroupNumber;
        this. Faculty = Faculty;
    }
    @Override
    public String toString(){
        return String.format("%12s %10s %12d %2s ", Surname, Name, GroupNumber, Faculty);
    }
}
