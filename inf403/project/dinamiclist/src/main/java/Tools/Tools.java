package Tools;

public class Tools {
    public static Node add(Node x, int i) {
        Node current = new Node(i);
        x.next = current;
        return current;
    }


}
