package Lesson_7.ToolBoxCodeSamples;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter @ToString
public class MyGraph {
     private int vertexes;
     private int edges = 0;
     private List<LinkedList<Integer>> adjList; //adjacency list


    public MyGraph(int vertexes) { //первоначально создаем несвязный граф
        if (vertexes <= 0) throw new IllegalArgumentException("Graph should contain > 0 vertex(es)");
        this.vertexes = vertexes;
        adjList = new ArrayList<>(vertexes);
        for (int i = 0; i < vertexes; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public LinkedList getAdjList(int edge) {
        return (LinkedList) adjList.get(edge).clone();
    }

    public void addEdge(int vertex1, int vertex2) {
        if (vertex1 < 0 || vertex2 < 0 || vertex1 > vertexes || vertex2 > vertexes)
            throw new IllegalArgumentException("Incorrect input, argument(s) must be > 0 and less then "+vertexes);
        adjList.get(vertex1).add(vertex2);
        adjList.get(vertex2).add(vertex1);

    }
}
