/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctdl;

/**
 *
 * @author Admin
 */

public interface QueueInterface {
    public void enqueue(int item);
    public int dequeue();
    public boolean isEmpty();
    public int size();
    public int peek();

}
