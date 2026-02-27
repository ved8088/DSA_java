package leetcode;
//   Implement Queue using Stacks
public class problem232 {
    private static class Stack {
        int[] arr;
        int top;

        Stack(int size) {
            arr = new int[size];
            top = -1;
        }

        void push(int x) {
            arr[++top] = x;
        }

        int pop() {
            return arr[top--];
        }

        int peek() {
            return arr[top];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    Stack inStack;
    Stack outStack;

    public problem232() {
        inStack = new Stack(100);
        outStack = new Stack(100);

    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        shiftIfNeeded();
        return outStack.pop();
    }

    public int peek() {
        shiftIfNeeded();
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void shiftIfNeeded(){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
    }

    public static void main(String[] args) {

        problem232 q = new problem232();

        q.push(1);
        q.push(2);
        q.peek();   // should be 1
        q.pop();    // removes 1
        q.push(3);
        q.peek();   // should be 2
        q.pop();    // removes 2
        q.pop();    // removes 3

        System.out.println("\nIs queue empty? " + q.empty());

    }
}
