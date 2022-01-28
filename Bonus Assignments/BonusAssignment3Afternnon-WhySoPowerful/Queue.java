public class Queue<T> {

    private int total;
    private MyNode first, last;

    private class MyNode {
        private T data;
        private MyNode next;

        public MyNode(T data) {
            this.data = data;
        }
    }

    public boolean add(T element) {
        MyNode newNode = new MyNode(element);

        MyNode current = last;
        last = newNode;

        if (total == 0) {
            first = last;
        } else {
            current.next = last;
        }
        total++;

        return true;
    }

    // peek()
    public T get() {
        if (total == 0) {
            return null;
        }
        return first.data;
    }

    public T get(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        MyNode current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void clear() {
        first = null;
        last = null;
        total = 0;
    }

    public int size() {
        return total;
    }

    public T remove() {
        if (total == 0) {
            return null;
        }

        T data = first.data;
        first = first.next;
        total--;

        if (total == 0) {
            last = null;
        }

        return data;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyNode tmp = first;
        while (tmp != null) {
            sb.append(tmp.data).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }
}