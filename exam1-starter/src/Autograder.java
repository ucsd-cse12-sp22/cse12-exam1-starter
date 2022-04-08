import java.util.ArrayList;

// TODO: Implement Autograder class

// TODO: Implement Ticket class

// Provided Code - Do not change
interface Exam_SQ<E> {
    void add(E element);
    E pop();
    boolean empty();
}

class Exam_Stack<E> implements Exam_SQ<E> {
    ArrayList<E> stack;

    public Exam_Stack() {
        stack = new ArrayList<E>();
    }

    public void add(E element) {
        stack.add(element);
    }

    public E pop() {
        if (stack.size() == 0) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean empty() {
        return stack.size() == 0;
    }
}

class Exam_Queue<E> implements Exam_SQ<E> {
    ArrayList<E> queue;

    public Exam_Queue() {
        queue = new ArrayList<E>();
    }

    public void add(E element) {
        queue.add(element);
    }

    public E pop() {
        return queue.remove(0);
    }

    public boolean empty() {
        return queue.size() == 0;
    }
}
