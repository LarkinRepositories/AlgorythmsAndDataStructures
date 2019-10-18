package Lesson_7.HomeWork;

import Lesson_7.ToolBoxCodeSamples.BreadthFirstSearch;
import Lesson_7.ToolBoxCodeSamples.MyGraph;
import org.testng.annotations.Test;



/*
Реализовать программу, в которой задается граф из 10 вершин.
Задать ребра и найти кратчайший путь с помощью поиска в ширину.
 */

public class HomeWork {
    @Test
    public void findPath() {
        MyGraph graph = new MyGraph(10);
        graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(0, 5);
        graph.addEdge(2, 8);
        graph.addEdge(2, 9);
        graph.addEdge(2, 6);
        graph.addEdge(3, 2);
        graph.addEdge(4, 3);
        graph.addEdge(5, 7);
        graph.addEdge(5, 6);
        graph.addEdge(5, 2);

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch(graph, 4);
        assert breadthFirstSearch.hasPathTo(8);
        assert breadthFirstSearch.pathTo(8).toString().equalsIgnoreCase("[3, 2, 8]");
    }
}
