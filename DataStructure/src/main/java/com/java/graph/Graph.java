package com.java.graph;

import java.util.List;

public interface Graph {
    void addEdge(int v1, int v2);

    List<Integer> getAdjacentVartices(int v) throws IllegalAccessException;

    int getNumVertices();

    int getIndegree(int v) throws IllegalAccessException;

    void displayGraph();

}
