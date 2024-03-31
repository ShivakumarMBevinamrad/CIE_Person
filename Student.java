import java.time.LocalDate;

class Student {
    private String name;
    private int age;
    private int yearOfBirth;

    public Student(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.age = calculateAge(yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    private int calculateAge(int yearOfBirth) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - yearOfBirth;
    }
}

class Date {
    public static LocalDate calculateDOB(Student student) {
        int yearOfBirth = student.getYearOfBirth();
        return LocalDate.of(yearOfBirth, 1, 1); // Assuming January 1st as the default DOB for simplicity
    }

    public static void main(String[] args) {
        System.out.println("Student Information");
        Student student1 = new Student("John", 2000);
        LocalDate dob1 = calculateDOB(student1);
        System.out.println("Student: " + student1.getName() + ", DOB: " + dob1);

        Student student2 = new Student("Alice", 1995);
        LocalDate dob2 = calculateDOB(student2);
        System.out.println("Student: " + student2.getName() + ", DOB: " + dob2);
    }
}
