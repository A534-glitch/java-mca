import java.util.LinkedList;

public class ClearLinkedList {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original LinkedList: " + list);

        
        list.clear();

        System.out.println("LinkedList after removing all elements: " + list);
    }
}
