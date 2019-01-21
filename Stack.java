
public class Stack {
	int top;
	int length;
	int size;
	int[] stack;

	public Stack(int n) {
		stack = new int[n];
		top = -1;
		length = 0;
		size = n;
	}

	public void push(int n) {
		if (isFull()) {
			System.out.println("Stack Overflow");
		} else {
			stack[++top] = n;
			length++;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
		} else {
			stack[top--] = 0;
			length--;
		}
	}

	public boolean isFull() {
		return size == length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int peek() {
		return stack[top];
	}

	public void display() {
		for (int x = 0; x < size; x++) {
			System.out.println(stack[x]);
		}
	}
}
