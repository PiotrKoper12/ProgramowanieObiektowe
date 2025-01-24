public class MainStudent {
    public static void main(String[] args) {
        // Tworzymy listę studentów
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 4.5));
        students.add(new Student(2, "Bob", 4.8));
        students.add(new Student(3, "Charlie", 4.5));
        students.add(new Student(4, "David", 4.2));
        students.add(new Student(5, "Eve", 4.8));

        // Sortujemy listę za pomocą StudentComparator
        Collections.sort(students, new StudentComparator());

        // Wyświetlamy posortowaną listę
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
