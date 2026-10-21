# DSA with Java

A collection of data structures and algorithm practice programs written in Java.

## Repository structure

| File | Topic | Description |
| --- | --- | --- |
| `Jan/BinaryTree.java` | Binary trees | Builds a binary tree from a preorder array, using `-1` to represent a missing child, and prints the root value. |
| `Jan/Problem143.java` | Linked lists | Demonstrates the linked-list reordering approach from LeetCode 143. |

## Run the examples

Install a JDK, then run these commands from the repository root:

```bash
javac -d out Jan/BinaryTree.java Jan/Problem143.java
java -cp out Jan.BinaryTree
java -cp out Jan.Problem143
```

The source files declare the `Jan` package, so use fully qualified class names when running them. The `out/` directory contains compiled classes and can be regenerated at any time.

## Adding practice solutions

- Keep source files in the package directory that matches their `package` declaration.
- Give each standalone exercise a descriptive class or problem-number name.
- Include a small `main` method or test that makes the example easy to run.
