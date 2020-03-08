package tests.crackCode.lista;

public class Node {
    Node next;
    int data;
    public Node(int data) {
        this.data = data;
    }
    public void appendToTail(int data) {
        Node end = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    public Node deleteNode(Node head, int data) {
        Node n = head;
        if (n.data == data) {
            return head.next;
        }
        while(n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node raiz = new Node(1);
        raiz.appendToTail(2);
        raiz.appendToTail(3);
        System.out.println(raiz);
        raiz = raiz.deleteNode(raiz,2);
        System.out.println(raiz);
    }

}
