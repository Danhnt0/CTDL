/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctdl;


/**
 *
 * @author Admin
 */

public class SortedArrayPriorityQueue< K extends Comparable, E> implements priorityQueueInterface {
    public static class ArrEntry<K,E> implements Entry<K,E>{
        public K key;
        public E value;
        public ArrEntry(K key, E value){
            this.key = key;
            this.value = value;
        }
        public K getKey(){
            return key;
        }
        public E getValue(){
            return value;
        }
    }
    ArrEntry<K,E>[] arr;
    int n = 0;
    int defaultSize = 1000;

    public SortedArrayPriorityQueue(){
        arr = new ArrEntry[defaultSize];
    }

    public SortedArrayPriorityQueue(int size){
        arr = new ArrEntry[size];
    }

    private void swap(int i, int j){
        ArrEntry<K,E> temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    @Override
    public int size(){
        return n;
    }

    @Override
    public boolean isEmpty(){
        return n == 0;
    }

    @Override
    public void insert(Object key, Object value) {
        if(n == arr.length){
            ArrEntry<K,E>[] newArr = new ArrEntry[arr.length*2];
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[n] = new ArrEntry<K,E>((K)key, (E)value);
        n++;
        for(int i = 1; i < n; i++){
            int j = i;
            while(j > 0 && ((Comparable) arr[j].getValue()).compareTo(arr[j-1].getValue()) < 0){
                swap(j, j-1);
                j--;
                System.out.println("swap");
            }
        }
    }

    @Override
    public void insert(priorityQueueInterface.Entry entry) {
        insert(entry.getKey(), entry.getValue());
    }

    @Override
    public priorityQueueInterface.Entry min() {
        return arr[0];
    }

    @Override
    public priorityQueueInterface.Entry removeMin() {
        ArrEntry<K,E> min = arr[0];
        for(int i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        n--;
        return min;
    }

    public void setValue(K key, E value){
        for(int i = 0; i < n; i++){
            if(arr[i].getKey().compareTo(key) == 0){
                arr[i].value = value;
            }
        }
    }

}
