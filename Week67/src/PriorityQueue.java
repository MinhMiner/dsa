import java.util.NoSuchElementException;

public class PriorityQueue {
    // MinPriorityQueue
    private static final int CAPACITY = 100;
    private int size;
    private int[] queue;

    public PriorityQueue() {
        queue = new int[CAPACITY + 1];
        size = 0;
    }

    public void insert(int n) {
        queue[++size] = n;
        swim(size);
    }

    public int deleteMin() {
        if (size == 0) {
            throw new NoSuchElementException("Priority queue is empty");
        }

        int result = queue[1];
        exch(1, size);
        --size;
        sink(1);
        return result;
    }

    private void swim(int k) {
        while (k > 1 && less(k, k / 2)) 
        {
            exch(k, k / 2);
            k /= 2;
        }
    }

    private void sink(int k) { 
        while (2 * k <= size) 
        { 
            int j = 2 * k;

            if (j < size && less(j + 1, j)) {
                j++; 
            }

            if (less(k, j)) {
                break; 
            }

            exch(k, j); 
            k = j; 
        } 
    }

    private boolean less(int i, int j) {
        return (queue[i] < queue[j]);
    }

    private void exch(int i, int j) {
        int temp = queue[i];
        queue[i] = queue[j];
        queue[j] = temp;
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.insert(2);
        pq.insert(5);
        pq.insert(8);
        pq.insert(4);
        pq.insert(9);
        System.out.print(pq.deleteMin() + " ");
        System.out.print(pq.deleteMin() + " ");
        System.out.print(pq.deleteMin() + " ");
        System.out.print(pq.deleteMin() + " ");
        System.out.print(pq.deleteMin() + " ");
    }
}
