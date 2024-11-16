package service;

import domain.Vertex;
import java.util.List;
import java.util.Stack;

public class DepthFirstStackSearch<T> implements Structure<Vertex<T>>  {

    Stack<Vertex<T>> verticesStack = new Stack<>();

    public void process(List<Vertex<T>> vertices) {
        process(vertices.getFirst(), vertices);
    }

    public void process(Vertex<T> vertex, List<Vertex<T>> vertices) {
        var currVertex = vertex;
        if(!vertex.isVisited()){
            verticesStack.push(currVertex);
            while(!verticesStack.empty()){
                currVertex = verticesStack.pop();
                currVertex.visit();
                for( Integer pos : currVertex.getAdjVertices().reversed()){
                    var vertexToVisit = vertices.get(pos);
                    verticesStack.push(vertexToVisit);
                }
            }
        }
    }
}
