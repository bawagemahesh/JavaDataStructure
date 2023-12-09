package com.java.graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new AdjcencyMatrixGraph(8 );

        graph.addEdge(1, 0);
        graph.addEdge(1, 2);

        graph.addEdge(1, 5);
        graph.addEdge(3, 4);

        graph.addEdge(2, 7);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(5, 6);

        graph.addEdge(6, 3);


    }
}
