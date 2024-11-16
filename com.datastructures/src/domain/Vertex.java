package domain;

import java.util.List;

public class Vertex<T> {

    T value;
    List<Integer> adjVertices;
    boolean isVisited = false;

    public Vertex(T value, List<Integer> adjVertices) {
        this.value = value;
        this.adjVertices = adjVertices;
    }

    public void visit() {
        System.out.println("Vertex " + value + " is visited");
        isVisited = true;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public List<Integer> getAdjVertices() {
        return this.adjVertices;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if(adjVertices.isEmpty()){
            sb.append(this.value)
                    .append(" -| ")
                    .append("\n");
        } else {
            adjVertices.forEach(adjVertex -> sb.append(this.value)
                    .append(" -> ")
                    .append(adjVertex)
                    .append("\n"));
        }
        return sb.toString();
    }

}
