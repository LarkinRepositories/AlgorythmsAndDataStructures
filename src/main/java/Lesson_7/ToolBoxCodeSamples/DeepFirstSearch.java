package Lesson_7.ToolBoxCodeSamples;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//поиск в глубину
public class DeepFirstSearch {
    //private List<Boolean> marked;
    private boolean[] marked;
    private int[] edges;
    private int startPoint;


    private void dfs(MyGraph graph, Integer startPoint) {
        marked[startPoint] = true;
        graph.getAdjList(startPoint).forEach(e -> {
            if (!marked[e]) {
                edges[e] = startPoint;
                dfs(graph, e);
            }
        });
//        for (Integer element : graph.getAdjList(startPoint)) {
//            if (!marked[element]) {
//                edges[element] = startPoint;
//                dfs(graph, element);
//            }
//        }
    }

    public DeepFirstSearch(MyGraph graph, int startPoint) {
        this.startPoint = startPoint;
        marked = new boolean[graph.getVertexes()];
        edges = new int[graph.getVertexes()];
        dfs(graph, startPoint);
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
