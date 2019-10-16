package Lesson_7.ToolBoxCodeSamples;


import java.util.ArrayList;
import java.util.List;

//поиск в глубину
public class DeepFirstSearch {
    private List<Boolean> marked;
    private List<Integer> edges;
    private int startPoint;

    public DeepFirstSearch(MyGraph graph, int startPoint) {
//        if (startPoint <= 0 || startPoint > graph.getVertexes()) {
//            throw new IllegalArgumentException();
//        }
        this.startPoint = startPoint;
        marked = new ArrayList<>(graph.getVertexes());
        edges = new ArrayList<>(graph.getVertexes());
        dfs(graph, startPoint);
    }

    private void dfs(MyGraph graph, Integer startPoint) {
        marked.set(startPoint, true);
        graph.getAdjList(startPoint).forEach(e-> {
            if (!marked.get((Integer) e)) {
                edges.set((Integer) e, startPoint);
                dfs(graph, (Integer) e);
            }
        });
    }

}
