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

    public void dfs(String node){
        Stack<String> stack = new Stack<>();
        Set<String> visited = new HashSet<>();

        do {
            List<Edge> edges = nodes.get(node);
            String nextNode;

            int i = 0;
            do {
                nextNode = edges.get(i).getDestNode();
                if (visited.contains(node + nextNode)) {
                    nextNode = null;
                    i++;
                } else {
                    break;
                }
            } while (i < edges.size());

            boolean pop = false;
            if (nextNode == null && stack.isEmpty()) {
                break;
            } else if(nextNode == null) {
                nextNode = stack.pop();
                pop = true;
            } else {
                stack.push(node);
            }

            if(!pop) {
                System.out.println(node + " => " + nextNode);
            }

            visited.add(node + nextNode);
            node = nextNode;

        } while (node != null);
    }

    public void bfs(String node, Queue<String> queue, Set<String> visited){
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
            bfs(next, queue, visited);
        }
    }

}
