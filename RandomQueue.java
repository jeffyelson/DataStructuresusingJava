import java.util.Arrays;
import java.util.Random;

public class RandomQueue<T> implements Queue<T> {
    private static int size;

    public int front = 0, rear = 0;
    Random random = new Random();
    int size_Arr = random.nextInt(10000);
    @SuppressWarnings("unchecked")
    T[] RandQueue = (T[]) new Object[10];


    @Override
    public int size() {
        size = front;
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void enqueue(T item) {
        if (front == RandQueue.length) {
            RandQueue = Arrays.copyOfRange(RandQueue, 0, RandQueue.length * 2);
        }
        front++;
        RandQueue[front] = item;
    }

    @Override
    public T dequeue() {
        T dequeue;
        if (!isEmpty()) {
            dequeue = RandQueue[front];
            RandQueue[front] = null;
            front++;
            size--;
            return dequeue;
        } else
            return null;


    }

    public T front() {
        if (front == 0)
            return null;
        return RandQueue[front];
    }

    public T sample() {
        int idxRem = random.nextInt(size());
        T temp;
        temp = RandQueue[idxRem];
        RandQueue[idxRem] = RandQueue[front];
        RandQueue[front] = temp;
        return temp;
    }

}
