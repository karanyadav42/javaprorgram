
class Student {

    String Stud_id;
    String Stud_name;
    String grade;

    Student() {

    }

    Student(String a, String b, String c) {
        this();
        Stud_id = a;
        Stud_name = b;
        grade = c;

    }

    public static void main(String[] args) {
        Student s = new Student("01", "karan", "A");
        System.out.println(s.Stud_id + " " + s.Stud_name + " " + s.grade);
    }
}
