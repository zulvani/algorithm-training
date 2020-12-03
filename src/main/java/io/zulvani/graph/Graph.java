package io.zulvani.graph;

import java.util.*;

public class Graph {

    private LinkedHashMap<String, List<Edge>> nodes;

    public Graph() {
        this.nodes = new LinkedHashMap<>();
    }

    public void addEdge(String nodeSource, String nodeDest, Double weight){
        if(!nodes.containsKey(nodeSource)){
            nodes.put(nodeSource, new ArrayList<>());
        }

        if(!nodes.containsKey(nodeDest)){
            nodes.put(nodeDest, new ArrayList<>());
        }
        nodes.get(nodeSource).add(new Edge(nodeDest, weight));
    }

    public void print(){
        nodes.entrySet().stream().forEach(n -> {
            n.getValue().stream().forEach(e -> {
                System.out.println(n.getKey() + " => " + e.getDestNode());
            });
        });
    }

    public void traverseWithDFS(String node, Queue<String> queue, Set<String> visited){
        visited.add(node);

        nodes.get(node).stream().forEach(edge -> {
            if(!node.equals(edge.getDestNode())) {
                queue.add(edge.getDestNode());
            }
            System.out.println(node + " = " + edge.getWeight() + " => " + edge.getDestNode() + " [" + queue.size() + "] ");
        });

        boolean alreadyVisited = false;
        String next = null;
        do {
            next = queue.poll();
            alreadyVisited = visited.contains(next);
        } while(alreadyVisited);

        if(next != null) {
            traverseWithDFS(next, queue, visited);
        }
    }

}
