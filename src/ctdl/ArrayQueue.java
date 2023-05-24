/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctdl;

/**
 *
 * @author Admin
 */


import java.util.Iterator;

public class ArrayQueue implements QueueInterface {

    private int head;
    private int tail;
    private int[] arr;
    private int n;
    private int defaultSize = 10;

    public ArrayQueue() {
        this.head = 0;
        this.tail = 0;
        this.n= 0;
        this.arr = new int[defaultSize];
    }

    public ArrayQueue(int size) {
        this.head = 0;
        this.tail = 0;
        this.n = 0;
        this.arr = new int[size];
    }

    @Override
    public void enqueue(int item) {
        if (n == arr.length) {
            throw new IllegalStateException("Queue is full");
        }
        arr[tail] = item;
        tail = (tail + 1) % arr.length;
        n++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = arr[head];
        arr[head] = 0;
        head = (head + 1) % arr.length;
        n--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[head];
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < n; i++) {
            result += arr[(head + i) % arr.length] + ", ";
        }
        result += "]";
        return result;
    }


    
}
