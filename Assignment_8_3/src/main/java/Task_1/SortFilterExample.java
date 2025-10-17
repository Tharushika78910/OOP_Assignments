package Task_1;

import java.util.ArrayList;
import java.util.List;

public class SortFilterExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "London"));
        people.add(new Person("Charlie", 28, "New York"));
        people.add(new Person("David", 35, "Paris"));
        people.add(new Person("Eve", 22, "New York"));

        // Step 1: Sort by age
        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        System.out.println("Sorted by age:");
        people.forEach(System.out::println);

        // Step 2: Filter by city
        people.removeIf(person -> !person.getCity().equalsIgnoreCase("New York"));
        System.out.println("\nFiltered (only from New York):");
        people.forEach(System.out::println);
    }
}

