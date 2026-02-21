package edu.sdccd.cisc191;

import java.util.Arrays;

public class IntArrayToolkit {

    /**
     * Returns the sum of all values in the array.
     * @throws IllegalArgumentException if a is null
     */
    public static int sum(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("An null array cannot be summed.");
        }

        return Arrays.stream(a) // Get ints as Stream
            .sum(); // Sum up all ints
    }

    /**
     * Returns the maximum value in the array.
     * @throws IllegalArgumentException if a is null or empty
     */
    public static int max(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("An null array cannot have a max value.");
        } else if (a.length == 0) { // Avoiding a NullPointerException
            throw new IllegalArgumentException("An empty array cannot have a max value.");
        }

        return Arrays.stream(a) // Get ints as Stream
            .max() // Get the maximum int
            .getAsInt(); // Return int
        
        //  Personal opinion that although it's shorter it's slightly less readable + does more work than a standard loop
    }

    /**
     * Returns the index of the first occurrence of target, or -1 if not found.
     * @throws IllegalArgumentException if a is null
     */
    public static int indexOf(int[] a, int target) {
        if (a == null) {
            throw new IllegalArgumentException("A null array cannot be searched");
        }

        return Arrays.stream(a) // Get IntStream
            .boxed() // Convert to Stream<Integer> (Lists can only handle Integer class instances)
            .toList() // Convert to List<Integer>
            .indexOf(target); // Get index of element target as an unsigned int (or -1 if missing)
        
        // Allocates n Integer objects and various other things
    }

    /**
     * Returns a NEW array containing the same values as a, sorted ascending.
     * Does not modify the original array.
     * @throws IllegalArgumentException if a is null
     */
    public static int[] copySortedAscending(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("A null array cannot be sorted");
        }

        int[] newA = Arrays.copyOf(a, a.length); // Clone int[]
        Arrays.sort(newA); // Sort int[]

        return newA;
    }
}
