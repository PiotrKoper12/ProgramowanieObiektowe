import java.util.*;

class Student {
    private int id;
    private String name;
    private double averageGrade;

    public Student(int id, String name, double averageGrade) {
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', averageGrade=" + averageGrade + "}";
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int gradeComparison = Double.compare(s2.getAverageGrade(), s1.getAverageGrade());
        if (gradeComparison != 0) {
            return gradeComparison;
        }
        return s1.getName().compareTo(s2.getName());
    }
}
