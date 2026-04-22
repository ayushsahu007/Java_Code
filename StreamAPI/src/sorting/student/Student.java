package sorting.student;

public class Student {
    int rollNo;
    String sName;
    double marks;

    public Student(int rollNo, double marks, String sName) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.sName = sName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public String getsName() {
        return sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                ", marks=" + marks +
                '}';
    }

    //for grade
    public String getGrade() {
        if (marks > 90)
            return "Distinction";
        else if (marks >= 80)
            return "Grade A";
        else if (marks >= 70)
            return "Grade B";
        else if (marks >= 65)
            return "Grade C";
        else if (marks >= 45)
            return "Grade D";
        else
            return "Fail";
    }
}
