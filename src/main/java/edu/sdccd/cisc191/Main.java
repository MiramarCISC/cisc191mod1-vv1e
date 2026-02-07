package edu.sdccd.cisc191;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student("Michael",  3.5, 10),
            new Student("Skylar",   2.7, 47),
            new Student("Ahmed",    3.3, 5),
            new Student("Courtney", 3.7, 16),
            new Student("Quinn",    1.4, 23),
            new Student("Alex",     4.0, 31)
        };

        System.out.printf(
            "Original Order of Students:\n%s\n\n",
            getStudentsAsLines(students)
        );

        Student[] sortedStudents = StudentArrayToolkit.copySortedByGpaDesc(students);
        System.out.printf(
            "Student Order When Sorted by GPA:\n%s\n\n",
            getStudentsAsLines(sortedStudents)
        );

        Student[] topThreeStudents = StudentArrayToolkit.topNByGpa(students, 3);
        System.out.printf(
            "Top 3 Students by GPA:\n%s\n\n",
            getStudentsAsLines(topThreeStudents)
        );

        System.out.printf("Student with ID 47: %s\n",
            StudentArrayToolkit.findByIdLinear(students, 47)
        );

        System.out.printf("Student with non-existent ID 19: %s\n",
            StudentArrayToolkit.findByIdLinear(students, 19) == null?
                "N/A" :
                StudentArrayToolkit.findByIdLinear(students,19)
        );
    }

    /* NOTE: Method made for the sake of demonstration.
     * Would typically place it inside StudentArrayToolkit, but the method was not initially defined there,
     * so I am trying to cover my grounds by putting it here.
     */

    /**
     * Parses a Student Array into a multi-line string, with each line
     * containing a Student::toString representation.
     */
    private static String getStudentsAsLines(Student[] s) {
        if (s == null) {
            throw new IllegalArgumentException("Cannot supply an empty Student Array.");
        }

        return Arrays.stream(s)
            .map(Student::toString)
            .collect(Collectors.joining("\n"));
    }
}
