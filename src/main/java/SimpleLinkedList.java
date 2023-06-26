import java.util.LinkedList;

class SimpleLinkedList<T> {
    LinkedList<T> linkedList;
    SimpleLinkedList() {
        linkedList = new LinkedList<>();
    }

    SimpleLinkedList(T[] values) {
        linkedList = new LinkedList<>();
        for (T i:values) {
            linkedList.add(i);
        }
    }

    void push(T value) {
        linkedList.push(value);
    }

    T pop() {
        return linkedList.pop();
    }
    void reverse() {
        LinkedList<T> linkedListR = new LinkedList<>();
        for (int i = linkedList.size()-1; i >=0; i--) {
            linkedListR.add(linkedList.get(i));
        }
        linkedList=linkedListR;
    }

    T[] asArray(Class<T> clazz) {
        Object[] result = new Object[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            result[i] = linkedList.get(i);
        }
        return (T[])result;
    }

    int size() {
        return linkedList.size();
    }
}
