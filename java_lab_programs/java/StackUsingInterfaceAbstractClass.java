interface StackOperations {
    void push(int value);
    int pop();
    void display();
}

abstract class StackBase implements StackOperations {
    int[] stack;
    int top;

    StackBase(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow.");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow.");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}

class StaticStack extends StackBase {
    StaticStack(int size) {
        super(size);
    }
}

class DynamicStack extends StackBase {
    DynamicStack(int size) {
        super(size);
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            int[] larger = new int[stack.length * 2];
            System.arraycopy(stack, 0, larger, 0, stack.length);
            stack = larger;
        }
        stack[++top] = value;
    }
}

public class StackUsingInterfaceAbstractClass {
    public static void main(String[] args) {
        System.out.println("Static Stack:");
        StaticStack s1 = new StaticStack(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.display();
        System.out.println("Popped: " + s1.pop());

        System.out.println("Dynamic Stack:");
        DynamicStack s2 = new DynamicStack(2);
        s2.push(100);
        s2.push(200);
        s2.push(300);
        s2.display();
        System.out.println("Popped: " + s2.pop());
    }
}
