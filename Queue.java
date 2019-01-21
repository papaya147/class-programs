
public class Queue {
    int front;
    int rear;
    int length;
    int[] queue;
    int size;

    public Queue(int n) {
        front = -1;
        rear = -1;
        length = 0;
        size = n;
        queue = new int[n];
    }

    public void push(int n) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            queue[++rear] = n;
            length++;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            int[] copqueue = queue;
            queue = new int[size];
            for (int x = 0; x < size; x++) {
                if (x == size - 1) {
                } else {
                    queue[x] = copqueue[x + 1];
                }
            }
            length--;
        }
    }

    public boolean isFull() {
        return size == length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void display() {
        for (int x = 0; x < size; x++) {
            System.out.println(queue[x]);
        }
    }
}
