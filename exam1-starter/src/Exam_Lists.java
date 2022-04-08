import java.util.NoSuchElementException;
import java.util.Arrays; // Strictly for Debugging purposes

interface Exam_List<E> {
    void add(E element);
    E[] toArray();
    void flipAround(E element);
}

//TODO: Implement Exam_AList generic class

//TODO: Implement Exam_Llist generic class