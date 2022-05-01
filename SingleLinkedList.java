public class SingleLinkedList<T> implements List<T>{

    protected class Node<T> {
        protected T _item;
        protected Node<T> _next;
        private Node(T item, Node<T> next) {
            _item = item;
            _next = next;
        }

        public Node<T> getNext() {
            return this._next;
        }

        public void setNext(Node<T> next) {
            this._next = next;
        }

        public T getItem() {
            return this._item;
        }

        public void setItem(T item) {
            this._item = item;
        }

        /** public String toString() {
         return "[%s]".formatted(_item==null?"[]":_item.toString());
         }**/
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<T> getHead() {
        return this.head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    private int size;
    private Node<T> head;

    public SingleLinkedList() {
        this.size = 0;
    }

    @Override
    public boolean addItem(T item) {

        if (item == null)
            return false;

        if (head == null) {
            head = new Node<>(item,null);
        } else {
            Node<T> node = new Node<>(item, null);
            Node<T> lastnode = getLastNode(head);
            lastnode.setNext(node);
        }
        size++;
        return true;
    }

    @Override
    public boolean contains(T data) {
        boolean exists = false;

        if (data == null)
            return false;

        Node<T> cnode = head;
        while (cnode != null) {
            if (cnode.getItem() == data || cnode.getItem().equals(data)) {
                exists = true;
                break;
            }
            cnode = cnode.getNext();
        }
        return exists;
    }

    private Node<T> getLastNode(Node<T> node) {
        return node.getNext() != null ? getLastNode(node.getNext()) : node;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean addItem(T data, int index) {
        if (data == null)
            return false;

        if (index < 0)
            return false;

        if (index == 0) {
            addItem(data);
            return true;
        }

        if (index == length()) {
            addItem(data);
        } else if (index < length()) {
            Node<T> newNode = new Node<>(data,null);
            Node<T> prevNode = getNode(index - 1);
            Node<T> afterNode = getNode(index);
            newNode.setNext(afterNode);
            assert prevNode != null;
            prevNode.setNext(newNode);
            size++;
        } else {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
        return true;
    }


    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    public Node<T> getNode(int index) {


        if (index == 0)
            return head;

        if (index == length() - 1)
            return getLastNode(head);

        int cursor = 0;
        Node<T> cnode = head;

        while (cursor <= index) {
            if (cursor == index) {
                return cnode;
            } else {
                if (cnode != null) {
                    cnode = cnode.getNext();
                }
                cursor++;
            }
        }
        return null;
    }

    private boolean isNotElementIndex(int index) {
        return index < 0 || index > size - 1;
    }

    @Override
    public T getItem(int index) {
        if (isNotElementIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        } else {
            Node<T> cnode = head;
            for (int i = 0; i < index; i++) {
                cnode = cnode.getNext();
            }
            return cnode.getItem();
        }
    }

    @Override
    public T removeItem(int index) {
        if (isNotElementIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        } else {
            Node<T> cnode = head;
            for (int i = 0; i < index - 1; i++) {
                cnode = cnode.getNext();
            }
            T removed = cnode.getNext()._item;
            cnode._next = cnode.getNext().getNext();
            size--;
            return removed;
        }
    }

    public int find(T data) {
        boolean flag = false;
        if (data == null)
            return -1;

        Node<T> cnode = head;
        int index = 0;
        while (cnode != null) {

            if (cnode.getItem() == data || cnode.getItem().equals(data)) {
                flag = true;
                break;
            }
            index++;
            cnode = cnode.getNext();
        }
        if (flag) {
            return index;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        SingleLinkedList<String> sll = new SingleLinkedList<>();
        System.out.println(sll);
        sll.addItem("Hello");
        sll.addItem("World");
        System.out.println(sll);
        sll.addItem("Cruel", 1);
        System.out.println(sll);
        sll.addItem("Beautiful", 2);
        sll.removeItem(1);
        System.out.println(sll);
    }

}
