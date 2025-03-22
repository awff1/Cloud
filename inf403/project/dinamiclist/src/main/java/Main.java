import Tools.Node;
import Tools.Tools;

public class Main {
    public static void main(String[] args) {
        Node previous = new Node(1);
        for(int i = 2; i < 32; i++) {
            Node current = Tools.add(previous, i);
            previous = Tools.add(current,i);

        }
        System.out.println(Node.value);
    }
}
