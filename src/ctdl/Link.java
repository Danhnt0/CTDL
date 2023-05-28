/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctdl;


/**
 *
 * @author Admin
 */
public class Link {
    private class Node {
        Vertex vertex;
        Node next;

        public Node(Vertex vertex) {
            this.vertex = vertex;
            this.next = null;
        }
    }

    private Node head;
    

    public Link() {
        this.head = null;
    }

    public void addVertex(Vertex vertex) {
        if (head == null) {
            head = new Node(vertex);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(vertex);
        }
    }

    public void addVertex(int x, int y) {
        if (head == null) {
            head = new Node(new Vertex(x, y));
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(new Vertex(x, y));
        }
    }

    public int findIndex(Vertex vertex) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.vertex.getX() == vertex.getX() && current.vertex.getY() == vertex.getY()) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // find  vertex have distance near the x, y with distance = 30

    public Vertex findVertex(int x, int y) {
        Node current = head;
        while (current != null) {
            if (Math.abs(current.vertex.getX() - x) <= 40 && Math.abs(current.vertex.getY() - y) <= 40) {
                return current.vertex;
            }
            current = current.next;
        }
        return null;
    }

    public Vertex findVertex(Vertex vertex) {
        Node current = head;
        while (current != null) {
            if (current.vertex.getX() == vertex.getX() && current.vertex.getY() == vertex.getY()) {
                return current.vertex;
            }
            current = current.next;
        }
        return null;
    }

    public Vertex findVertex(int level){
        Node current = head;
        int index = 0;
        while (current != null) {
            if (index == level) {
                return current.vertex;
            }
            index++;
            current = current.next;
        }
        return null;
    }

    public boolean isEquals(Vertex vertex1, Vertex vertex2) {
        return vertex1.getX() == vertex2.getX() && vertex1.getY() == vertex2.getY();
    }


    public int findLevel(Vertex vertex) {
        Node current = head;
        int level = 0;
        while (current != null) {
            if (current.vertex.getX() == vertex.getX() && current.vertex.getY() == vertex.getY()) {
                return level;
            }
            level++;
            current = current.next;
        }
        return -1;
    }

}
