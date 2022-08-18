package Week1.Day2;

class Student {
    int id;      // instance variable
    String name; // instance variable

    static int counter = 0;  // static variable

    public Student() {
        counter++;  // This static variable will increase everytime object gets created.
    }

    public void showMarks() {
        int marks = 90 ; // local variable
        System.out.println(this.name+" with Roll No. "+id+" has Marks == :: "+marks);
        System.out.println("Counter value : "+counter);
    }
}

public class VariableDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Ashraf";
        s1.showMarks();

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Eoin ";
        s2.showMarks();

    }
}

/*

Ashraf with Roll No. 1 has Marks == :: 90
Counter value : 1

Eoin  with Roll No. 2 has Marks == :: 90
Counter value : 2

* */
