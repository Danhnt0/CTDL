/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctdl;

/**
 *
 * @author Admin
 */
public class ArrayStack implements StackInterface {
    
    private int[] stack;
    private int top;
    private int n;
    private int defaultSize = 10;

    public ArrayStack() {
        this.stack = new int[defaultSize];
        this.top = -1;
        this.n = 0;
    }

    public ArrayStack(int size) {
        this.stack = new int[size];
        this.top = -1;
        this.n = 0;
    }

    @Override
    public void push(int item) {
        if (n == stack.length) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = item;
        n++;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int item = stack[top];
        stack[top--] = 0;
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
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    
}
