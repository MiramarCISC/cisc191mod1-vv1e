package edu.sdccd.cisc191;

public class Student {

    private final String name;
    private final double gpa;
    private final int id;

    /**
     * Creates a new instance of the Student class.
     * Validation rules:
     * - name must not be null or blank
     * - gpa must be in [0.0, 4.0]
     * - id must be > 0
     *
     * @throws IllegalArgumentException if any argument is invalid
     */
    public Student(String name, double gpa, int id) {
        // Validate and assign name
        if (name == null) {
            throw new IllegalArgumentException("Name must not be null!");
        } else if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be blank!");
        } else {
            this.name = name;
        }

        // Validate and assign GPA
        if (gpa < 0.0f || gpa > 4.0f) {
            throw new IllegalArgumentException("GPA must be within 0-4.");
        } else {
            this.gpa = gpa;
        }

        // Validate and assign ID
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be a positive number.");
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        // Ex: Student{id=0, name='foo', gpa=4.3}
        return String.format(
            "%s{id=%d, name='%s', gpa=%.1f}", // Very clean
            this.getClass().getSimpleName(), id, name, gpa
        );
    }
}
