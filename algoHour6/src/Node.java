import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Node<T> {
    T val;
    Node<T> next;
    }
    public Node(T val) {
    this.val = val;
    this.next = next;
    }
}
    class Solution
    {
        public static List<String> linkedListValues(Node <String> head)
    {
        List<String> values = new ArrayList<>();
        while (head != null)
        {
            values.add(head.val);
            head = head.next;
        }
        return values;
    }
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
    }
}