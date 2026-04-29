import java.util.LinkedList;

public class GenericSearch {

    // Generic method
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        // Test with Integer (roll numbers)
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        int searchRoll = 102;
        System.out.println("Searching roll number " + searchRoll + ": "
                + searchElement(rollNumbers, searchRoll));

        // Test with String (names)
        LinkedList<String> names = new LinkedList<>();
        names.add("Raj");
        names.add("Priya");
        names.add("Amit");
        names.add("Neha");

        String searchName = "Amit";
        System.out.println("Searching name " + searchName + ": "
                + searchElement(names, searchName));
    }
}
