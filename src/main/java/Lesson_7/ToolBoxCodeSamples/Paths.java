package Lesson_7.ToolBoxCodeSamples;

import java.util.LinkedList;

public class Paths {
    private MyGraph graph;
    private int source;

    public Paths(MyGraph graph, int source) {
        this.graph = graph;
        this.source = source;
    }

    public boolean hasPathTo(int dist) {
        return false;
    }

    public LinkedList pathTo(int dist) {
        return new LinkedList();
    }

}
