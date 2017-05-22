package chapter11;

import java.util.LinkedList;

/**
 * Created by vi on 22.05.17.
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    public void push(T v) { storage.addFirst(v);}
    public T peek() { return storage.getFirst();}
    public T top() { return  storage.removeFirst();}
    public boolean empty() { return storage.isEmpty();}
    public  String toString() { return storage.toString();}
}
