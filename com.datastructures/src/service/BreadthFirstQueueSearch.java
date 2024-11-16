package service;

import domain.Vertex;

import java.util.LinkedList;
import java.util.List;

public class BreadthFirstQueueSearch<T> implements Structure<Vertex<T>> {

    LinkedList<Vertex<T>> verticesQueue = new LinkedList<>();

    public void process(List<Vertex<T>> vertices) {
        process(vertices.getFirst(), vertices);
    }

    public void process(Vertex<T> vertex, List<Vertex<T>> vertices) {
        var currVertex = vertex;
        if(!vertex.isVisited()){
            verticesQueue.add(currVertex);
            while(!verticesQueue.isEmpty()){
                currVertex = verticesQueue.removeFirst();
                currVertex.visit();
                for( Integer pos : currVertex.getAdjVertices()){
                    var vertexToVisit = vertices.get(pos);
                    verticesQueue.add(vertexToVisit);
                }
            }
        }
    }
}
