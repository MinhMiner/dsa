import java.util.Scanner;

public class QueueWithTwoStacks {
    private final Stack<Integer> enqueueStack = new Stack<>();
    private final Stack<Integer> dequeueStack = new Stack<>();
    private int firstEnqueueStack;

    /** Add x at the end of the queue. */
    public void enqueue(int x) {
        if (enqueueStack.isEmpty()) {
            firstEnqueueStack = x;
        }
        enqueueStack.push(x);
    }

    /** Remove the first element in the queue. */
    public int dequeue() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.pop();
    }

    /** Print the first element in the queue. */
    public void print() {
        if (!dequeueStack.isEmpty()) {
            System.out.println(dequeueStack.peek());
        } else {
            System.out.println(firstEnqueueStack);
        }
    }

    /** Test */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        QueueWithTwoStacks myStack = new QueueWithTwoStacks();

        while (queries-- > 0) {
            int queryType = sc.nextInt();
            switch (queryType) {
                case 1:
                    int x = sc.nextInt();
                    myStack.enqueue(x);
                    break;
                case 2:
                    myStack.dequeue();
                    break;
                case 3:
                    myStack.print();
                    break;
            }
        }

        sc.close();
    }
}