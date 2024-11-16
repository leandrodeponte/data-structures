import domain.Vertex;
import service.BreadthFirstQueueSearch;
import service.DepthFirstRecursiveSearch;
import service.DepthFirstStackSearch;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static DepthFirstRecursiveSearch<Integer> depthFirstRecursiveSearch = new DepthFirstRecursiveSearch<>();
    static DepthFirstStackSearch<Integer> depthFirstStackSearch = new DepthFirstStackSearch<>();
    static BreadthFirstQueueSearch<Integer> breadthFirstQueueSearch = new BreadthFirstQueueSearch<>();



    public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("Initial graph");
        var vertices = build();
        vertices.forEach(System.out::print);

        System.out.println("**************************");
        System.out.println("Starting Recursive DFS Search");
        depthFirstRecursiveSearch.process(vertices);

        vertices = build();
        System.out.println("**************************");
        System.out.println("Starting Stack DFS Search");
        depthFirstStackSearch.process(vertices);

        vertices = build();
        System.out.println("**************************");
        System.out.println("Starting Queue BFS Search");
        breadthFirstQueueSearch.process(vertices);

    }

    public static List<Vertex<Integer>> build() {
        ArrayList<Vertex<Integer>> list = new ArrayList<>();
        list.add(new Vertex<>(0, List.of(1, 2)));
        list.add(new Vertex<>(1, List.of(3)));
        list.add(new Vertex<>(2, List.of(5)));
        list.add(new Vertex<>(3, List.of(4, 6)));
        list.add(new Vertex<>(4, List.of()));
        list.add(new Vertex<>(5, List.of(7)));
        list.add(new Vertex<>(6, List.of()));
        list.add(new Vertex<>(7, List.of()));
        return list;
    }

}