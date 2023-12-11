package com.java.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjcencyMatrixGraph implements Graph{

    private int[][] adjancyMatrix;
    private int numVertices = 0;

    public AdjcencyMatrixGraph(int numVertices) {
        this.adjancyMatrix = new int[numVertices][numVertices];
        this.numVertices = numVertices;
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                adjancyMatrix[i][j] = 0;
            }
        }
    }

    @Override
    public void addEdge(int v1, int v2) {
       try{
        if(isValidVertexNum(v1, v2)){
            adjancyMatrix[v1][v2] = 0;
        }
       }catch (Exception e){
           System.out.println("Exception thrown");
       }
    }

    @Override
    public List<Integer> getAdjacentVartices(int v) throws IllegalAccessException {
        if(v < 0 || v >= numVertices){
            throw new IllegalAccessException("Vertext number is not valid");
        }
        List<Integer> adjecentVerticesList = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            if(adjancyMatrix[v][i] !=0){
                adjecentVerticesList.add(i);
            }
        }
        Collections.sort(adjecentVerticesList);
        return adjecentVerticesList;
    }

    @Override
    public int getNumVertices() {
        return numVertices;
    }

    @Override
    public int getIndegree(int v) throws IllegalAccessException {
        if(v < 0 || v >= numVertices){
            throw new IllegalAccessException("Vertext number is not valid");
        }
        int indegree = 0;
        for (int i = 0; i < numVertices; i++) {
            if(adjancyMatrix[i][v] !=0){
                indegree++;
            }
        }
        return indegree;
    }

    @Override
    public void displayGraph() {
        System.out.println("Adjancey Matrix\n");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.println(adjancyMatrix[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println();

        for (int i = 0; i < numVertices; i++) {
            System.out.println("Edges from " + i + " to: ");
            for (int j = 0; j < numVertices; j++) {
                if(adjancyMatrix[i][j] > 0){
                    System.out.println(j + " ");
                }
                System.out.println();
            }
        }
    }


    private boolean isValidVertexNum(int v1, int v2) throws IllegalAccessException {
        if(v1 >= numVertices || v2 >=numVertices || v1< 0 || v2 <0){
            throw new IllegalAccessException("Vertext number is not valid");
        }
        return true;
    }
}
