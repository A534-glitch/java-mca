
class Stack<T> {
    private int maxSize;
    private T[] stackArray;
    private int top;

    
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        maxSize = size;
        stackArray = (T[]) new Object[maxSize]; // generic array creation
        top = -1;
    }

    
    public void push(T value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack.");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    // Pop operation
    public T pop() {
        if (top >= 0) {
            T value = stackArray[top--];
            System.out.println(value + " popped from stack.");
            return value;
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}

public class GenericStackDemo {
    public static void main(String[] args) {
        
        Stack<Integer> intStack = new Stack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.pop();
        intStack.pop();
        intStack.pop();

        System.out.println();

        
        Stack<String> stringStack = new Stack<>(3);
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.pop();
        stringStack.push("Java");
        stringStack.pop();
    }
}
