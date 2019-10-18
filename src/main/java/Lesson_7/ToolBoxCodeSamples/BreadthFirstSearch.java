package Lesson_7.ToolBoxCodeSamples;

import java.util.LinkedList;
import java.util.List;

public class BreadthFirstSearch {
    private boolean[] marked;
    private int[] edges;
    private int[] distances;
    private int startPoint;
    private final int INFINITY = Integer.MAX_VALUE;

    private void bfs(MyGraph graph, int startPoint) {
       LinkedList<Integer> queue = new LinkedList<>();
       queue.addLast(startPoint);
       marked[startPoint] = true;
       distances[startPoint] = 0;
       while(!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            graph.getAdjList(vertex).forEach(e -> {
                if (!marked[e]) {
                    marked[e] = true;
                    edges[e] = vertex;
                    distances[e] = distances[vertex]+1;
                    queue.addLast(e);
                }
            });
       }
    }


    public BreadthFirstSearch(MyGraph g, int startPoint) {
        marked = new boolean[g.getVertexes()];
        this.startPoint = startPoint;
        edges = new int[g.getVertexes()];
        distances = new int[g.getVertexes()];
        for (int i = 0; i< distances.length; i++) {
            distances[i] = INFINITY;
        }
        bfs(g, startPoint);
    }

    public boolean hasPathTo(int vertex) {
        return marked[vertex];
    }

    public List pathTo(int vertex) {
        if (!hasPathTo(vertex)) return null;
        LinkedList<Integer> stack = new LinkedList<>();
        int v = vertex;
        while (v != startPoint) {
            stack.push(v);
            v  = edges[v];
        }
        return stack;
    }
}
