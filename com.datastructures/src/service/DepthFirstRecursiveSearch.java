package service;

import domain.Vertex;

import java.util.List;

public class DepthFirstRecursiveSearch<T> implements Structure<Vertex<T>> {

    public void process(List<Vertex<T>> vertices) {
        process(vertices.getFirst(), vertices);
    }

    public void process(Vertex<T> vertex, List<Vertex<T>> vertices) {
        if(!vertex.isVisited()){
            vertex.visit();
            for( Integer pos : vertex.getAdjVertices()){
                var vertexToVisit = vertices.get(pos);
                process(vertexToVisit, vertices);
            }
        }
    }
}
