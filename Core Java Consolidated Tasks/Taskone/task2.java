import java.util.*;

class Student {
    String name;
    int[] marks;
    int total;
    double average;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateTotalAndAverage();
    }

  
    private void calculateTotalAndAverage() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = total / (double) marks.length;
    }

   
    public int getTotal() {
        return total;
    }

   
    public double getAverage() {
        return average;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Total Marks: " + total + ", Average: " + average;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        List<Student> students = new ArrayList<>();

       
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            int[] marks = new int[numSubjects];

            System.out.println("Enter marks for " + numSubjects + " subjects:");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine();  

          
            students.add(new Student(name, marks));
        }

        Collections.sort(students, (s1, s2) -> Integer.compare(s2.getTotal(), s1.getTotal()));
        System.out.println("\nSorted list of students based on total marks:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
