package io.zulvani.graph;

public class Edge {
    private Double weight;
    private String destNode;
    private String sourceNode;

    public Edge(String sourceNode, String destNode, Double weight) {
        this.weight = weight;
        this.destNode = destNode;
        this.sourceNode = sourceNode;
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

    public String getSourceNode() {
        return sourceNode;
    }

    public void setSourceNode(String sourceNode) {
        this.sourceNode = sourceNode;
    }
}
