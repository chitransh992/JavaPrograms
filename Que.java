package javaPrograms;


import java.net.SocketPermission;
import java.util.LinkedList;


class EmptyQueueException extends Exception {
    public EmptyQueueException(String exception) {
        super(exception);
    }
}


public class Que<T> {
    private LinkedList<T> queue;


    public Que() {
        queue = new LinkedList<T>();
    }


    public void enqueue(T item) {
        queue.addLast(item);
    }


    public T dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is Empty");
        }
        return queue.removeFirst();
    }


    public T peek() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is Empty");
        }
        return queue.getFirst();
    }


    public boolean isEmpty() {
        return queue.isEmpty();
    }


    public int size() {
        return queue.size();
    }


    public static void main(String[] args) {


        Que<Integer> queue = new Que<Integer>();


        try {
            queue.dequeue();
        } catch (EmptyQueueException e) {

            System.out.println(e.getMessage());
        }


    }


}

