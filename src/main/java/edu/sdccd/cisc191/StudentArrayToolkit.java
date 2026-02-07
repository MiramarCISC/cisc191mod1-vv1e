package edu.sdccd.cisc191;

import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Comparator;

public class StudentArrayToolkit {

    /**
     * Returns a NEW array sorted by:
     * 1) GPA descending
     * 2) name ascending (tie-breaker)
     */
    public static Student[] copySortedByGpaDesc(Student[] students) {
        Student[] newStudents = Arrays.copyOf(students, students.length);
        Comparator<Student> comparator = Comparator
            .comparingDouble(Student::getGpa).reversed() // Compare GPA descending
            .thenComparing(Student::getName); // Compare name ascending

        Arrays.sort(newStudents, comparator);
        return newStudents;
    }

    /**
     * Linear search for a student by id.
     * Returns the Student if found, otherwise null.
     */
    @Nullable // <- Annotation useful for IDEs
    public static Student findByIdLinear(Student[] students, int id) {
        return Arrays.stream(students) // Get Students as a lazy Stream
            .filter(student -> student.getId() == id) // Limit Stream to only Students with an ID == id
            .findFirst() // Get first (and only) Student from Stream
            .orElse(null); // Return Student or null if they do not exist
    }

    /**
     * Returns a NEW array containing the top N (at most) students by GPA desc (ties: name asc).
     * @throws IllegalArgumentException if n < 0
     */
    public static Student[] topNByGpa(Student[] students, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot get a negative amount of students");
        } else if (n == 0) {
            // Returns empty array if n == 0
            return new Student[]{};
        }

        // Sorting students (GPA desc, Name asc)
        Student[] newStudents = copySortedByGpaDesc(students);

        if (n > newStudents.length) {
            return newStudents;
        } else {
            // NOTE: Technically wasteful, but the array will not be big enough to matter
            return Arrays.copyOf(newStudents, n);
        }
    }
}
