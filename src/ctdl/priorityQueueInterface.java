/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctdl;


/**
 *
 * @author Admin
 */

public interface priorityQueueInterface<K,E>{


    public interface Entry<K,E>{
        public K getKey();
        public E getValue();
    }

    public int size();
    public boolean isEmpty();
    public void insert(K key, E value);
    public void insert(Entry<K,E> entry);
    public Entry<K,E> min();
    public Entry<K,E> removeMin();
}
