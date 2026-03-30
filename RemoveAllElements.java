import java.util.LinkedList;

public class RemoveAllElements {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        // Remove all elements
        list.clear();

        System.out.println("List after removing all elements: " + list);
    }
}