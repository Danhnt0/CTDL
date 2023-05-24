/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctdl;

/**
 *
 * @author Admin
 */
public class Graph {
    private int size;
    protected int[][] matrix;
    private int E = 0;

    Graph(int size) {
        this.size = size;
        matrix = new int[size][size];
    }


    public void addEdge(int i, int j) {
        matrix[i][j] = 1;
    }

    public void addEdge(int i, int j, int value) {
        matrix[i][j] = value;
    }

    public boolean isConnect(int i, int j) {
        return matrix[i][j] == 1;
    }

    public int deleteEdge(int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = 0;
        return temp;
    }

    public int deleteNode(int i) {
        int temp = 0;
        for (int j = 0; j < size; j++) {
            if (matrix[i][j] == 1) {
                temp = matrix[i][j];
                matrix[i][j] = 0;
            }
        }
        return temp;
    }

    // find edge of node i
    public int[] findEdge(int i) {
        int[] temp = new int[size];
        int count = 0;
        for (int j = 0; j < size; j++) {
            if (matrix[i][j] == 1) {
                temp[count] = j;
                count++;
            }
        }
        return temp;
    }

    // find node neighbor of node i
    public int[] findNeighbor(int i) {
        int[] temp = new int[size];
        int count = 0;
        for (int j = 0; j < size; j++) {
            if (matrix[i][j] != 0) {
                temp[count] = j;
                count++;
            }
        }
        return temp;
    }

    public int getSize() {
        return size;
    }


    

}
