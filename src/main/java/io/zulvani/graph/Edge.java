package io.zulvani.graph;

public class Edge {
    private Double weight;
    private String destNode;

    public Edge(String destNode, Double weight) {
        this.weight = weight;
        this.destNode = destNode;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDestNode() {
        return destNode;
    }

    public void setDestNode(String destNode) {
        this.destNode = destNode;
    }
}
