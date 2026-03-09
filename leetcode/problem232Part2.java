package leetcode;

import java.util.Stack;
// optional way to do this problem

public class problem232Part2 {

}

class QueueUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

            return removed;

    }

    public int peek() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int peeked = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return peeked;
    }

}

class QueueUsingStackRemoveEfficient {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemoveEfficient(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);

        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }

    public int remove() throws Exception{
        return 0;

    }

    public int peek() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }

        int peeked = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }

        return peeked;
    }

}


