package adv;

public class Main2 {
    public static void main(String[] args) {
        Node n3 = new Node(3, null);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        Node current = n1;
        int length = 0;

        while (current != null) {
            length++;
            current = current.next;
        }

        System.out.println(length);


        current = n1;
        int sum = 0;
        while (current != null) {
            sum += current.value;
            current = current.next;
        }
        System.out.println(sum);


    }
}




