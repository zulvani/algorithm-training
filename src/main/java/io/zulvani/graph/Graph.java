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
        nodes.get(nodeSource).add(new Edge(nodeSource, nodeDest, weight));
    }

    public void print(){
        nodes.entrySet().stream().forEach(n -> {
            n.getValue().stream().forEach(e -> {
                System.out.println(n.getKey() + " => " + e.getDestNode());
            });
        });
    }

    private String printQueue(Queue<String> queue){
        StringBuilder r = new StringBuilder(" [" + queue.size() + "] ");
//        for(Edge edge : queue){
//            r.append(edge.getNode() + ",");
//        }
        return r.toString();
    }

    public void traverseWithDFS(String node, Queue<String> queue, Set<String> visited){
        visited.add(node);

        nodes.get(node).stream().forEach(edge -> {
            if(!node.equals(edge.getDestNode())) {
                queue.add(edge.getDestNode());
            }
            System.out.println(node + " = " + edge.getWeight() + " => " + edge.getDestNode() + printQueue(queue));
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
