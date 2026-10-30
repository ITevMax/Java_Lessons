package university.system;

import java.util.ArrayList;

public class University {
    private final String name;
    private final String city;
    private final ArrayList<Student> students = new ArrayList<>();

    public University(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStudents() {
        var studentsString = new StringBuilder();
        for (var student : students) {
            studentsString.append(student + "\n");
        }

        return studentsString.toString();
    }

    public String toString() {
        return String.format(
                "University Name: %s\n" +
                "University locate: %s\n" +
                "Count of students: %d",
                name, city, students.toArray().length
        );
    }

    public static class Department {
        private final String name;

        public Department(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return "Department: " + name;
        }
    }

    public class Student {
        private final String name;
        private final String surname;
        private final String speciality;

        Student(String name, String surname, String speciality) {
            this.name = name;
            this.surname = surname;
            this.speciality = speciality;

            students.add(this);

        }

        Student(String name, String surname) {
            this(name, surname, "Secret");
        }

        public String toString() {
            return String.format(
                    "Student:\n" +
                    "Name: %s\n" +
                    "Surname: %s\n" +
                    "Speciality: %s\n" +
                    "University: %s\n" +
                    "City: %s",
                    name, surname, speciality, University.this.name, University.this.city
            );
        }
    }

    public Student createStudent(String name, String surname, String speciality) {
        class StudentCreator {
            public Student create() {
                if (name.isBlank() || surname.isBlank() || speciality.isBlank()) {
                    System.out.println("One of the field is empty.\n" +
                            "Problem of creating a student.");
                    return null;
                }

                return new Student(name, surname, speciality);
            }
        }

        var creator = new StudentCreator();
        return creator.create();
    }

    public Student createSpecialStudent(String name, String surname) {
        return new Student(name, surname) {
            public String toString() {
                return String.format(
                        "Student:\n" +
                                "Name: %s\n" +
                                "Surname: %s\n" +
                                "Speciality: You have not enough rights\n" +
                                "University: %s\n" +
                                "City: %s",
                        name, surname, University.this.name, University.this.city
                );
            }
        };
    }
}