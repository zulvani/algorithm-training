package io.zulvani.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MainGraph {

    public MainGraph() {
        Graph graph = new Graph();
//        graph.addEdge("1", "2", 0.0);
//        graph.addEdge("1", "3", 0.0);
//        graph.addEdge("1", "4", 0.0);
//        graph.addEdge("1", "5", 0.0);
//        graph.addEdge("2", "6", 0.0);
//        graph.addEdge("2", "7", 0.0);
//        graph.addEdge("3", "8", 0.0);
//
//        graph.addEdge("1", "1", 0.0);

        graph.addEdge("2", "3", 0.1);
        graph.addEdge("2", "0", 0.2);
        graph.addEdge("3", "3", 1.0);
        graph.addEdge("0", "2", 1.0);
        graph.addEdge("0", "1", 2.0);
        graph.addEdge("1", "2", 1.0);

        graph.traverseWithDFS("2", new LinkedList<>(), new HashSet<>());
//        graph.print();
    }

    public static void main(String[] args){
        new MainGraph();
    }
}
