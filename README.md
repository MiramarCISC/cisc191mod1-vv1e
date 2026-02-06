[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/0HSqC20L)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22563349)
# CISC 191 — Module 1 Lab: Array Toolkit + Student Sorting 🧪🐙

Welcome! This repo is your starter code for **Module 1**.

You will implement:
- `IntArrayToolkit` (utility methods for `int[]`)
- `Student` (validated data model)
- `StudentArrayToolkit` (sorting/searching over `Student[]`)
- `Main` (small demo runner for your video)

✅ **Autograding:** Your score is based on passing the included JUnit tests (run locally with Maven, and on GitHub Actions).

---

## 🚨 Required Package (Do Not Change)

All source files must start with:

```java
package edu.sdccd.cisc191;
```

Your folder structure must match:

`src/main/java/edu/sdccd/cisc191/`

If your package or folder path differs, autograding will fail.

---

## ✅ Requirements Summary

### Part A — `IntArrayToolkit` (all methods are `static`)
Implement:

- `public static int sum(int[] a)`
  - throws `IllegalArgumentException` if `a` is null
- `public static int max(int[] a)`
  - throws `IllegalArgumentException` if `a` is null or empty
- `public static int indexOf(int[] a, int target)`
  - returns index of first occurrence, or `-1` if not found
  - throws `IllegalArgumentException` if `a` is null
- `public static int[] copySortedAscending(int[] a)`
  - returns a **NEW** sorted array (ascending)
  - must NOT modify original
  - throws `IllegalArgumentException` if `a` is null

### Part B — `Student`
Fields:
- `name` (String), `gpa` (double), `id` (int)

Constructor validation:
- name not null/blank
- gpa in `[0.0, 4.0]`
- id > 0  
Throw `IllegalArgumentException` if invalid.

Also include:
- getters
- `toString()` readable summary

### Part C — `StudentArrayToolkit` (all methods are `static`)
Implement:

- `public static Student[] copySortedByGpaDesc(Student[] students)`
  - returns a **NEW** array sorted by GPA descending
  - ties: name ascending
  - must NOT modify original
- `public static Student findByIdLinear(Student[] students, int id)`
  - returns matching student or `null`
- `public static Student[] topNByGpa(Student[] students, int n)`
  - returns a **NEW** array of top N students by GPA desc (ties: name asc)
  - if `n` > length, return all
  - if `n` < 0, throw `IllegalArgumentException`

🪄 **Lambda preview required:** Sorting must use a `Comparator` created via **lambda** or **method reference** (no anonymous inner classes).
(Note: this is graded primarily through peer review, not autograder.)

---

## ▶️ How to Run Tests Locally

From terminal:

```bash
mvn test
```

In IntelliJ:
- Open the Maven tool window
- Run `test`

---

## 🎥 Video Demo (3–5 minutes)

Show:
1. Your repo structure + correct package line
2. Running tests (green)
3. Running `Main` and explaining output

Answer these open-ended questions in your video:
- Q1: Where did you use defensive copying and why does it matter?
- Q2: Why can a method modify array contents passed into it?
- Q3: Why is a Comparator lambda useful for sorting objects?
- Q4: What bug did you hit (or avoid) and how did you debug it?

---

## 🤝 Peer Review (Due 1 week after lab deadline)

You will complete peer review via **GitHub Pull Request**:
- Make at least **2 meaningful improvements**
- Leave at least **5 review comments**
- PR description should explain what changed and why

✅ AI allowed for *feedback-writing only* (not for generating your partner’s solution code).

---

## 📌 Academic Integrity

Submit your own work. Do not copy from other students or online sources.
If you’re unsure whether something is allowed, ask first.
