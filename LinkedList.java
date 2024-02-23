public class LinkedList < E > {
    private Node < E > head;
    private Node < E > tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahDepan(E data) {
        Node < E > nodebaru = new Node < E > (data);

        if (isEmpty()) {
            head = tail = nodebaru;
        } else {
            nodebaru.next = head;
            head = nodebaru;
        }
    }

    public void tambahBelakang(E data) {
        Node < E > nodebaru = new Node < E > (data);

        if (isEmpty()) {
            head = tail = nodebaru;
        } else {
            tail.next = nodebaru;
            tail = nodebaru;
        }
    }

    public void hapusDepan(E data) {

        if (isEmpty()) {
            System.out.println("Kosong");
        } else {
            if (head == tail) {
                head = tail = null;
            } else {
                Node < E > sementara = head;
                head = head.next;
                sementara.next = null;
            }
        }
    }

    public void hapusBelakang(E data) {
        if (isEmpty()) {

            System.out.println("Kosong");
        } else {
            Node < E > iterator = head;
            while (iterator.next != tail) {
                iterator = iterator.next;
            }
            tail = iterator;
            tail.next = null;

        }
    }

    public void traverse() {
        Node < E > iterator = head;
        while (iterator.next != null) {
            System.out.println(iterator.getData());
            iterator = iterator.next;
        }
        System.out.println(iterator.getData());
    }

}

class Node < E > {
    E data;

    Node < E > next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    public E getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }
    
}