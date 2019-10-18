package Lesson_7.ToolBoxCodeSamples;

public class Main {
    public static void main(String[] args) {
        MyGraph graph = new MyGraph(10);
        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(7,8);
        System.out.println(graph.toString());
        System.out.println(graph.getAdjList(0));
        DeepFirstSearch dfs = new DeepFirstSearch(graph, 0);
        System.out.println(dfs.hasPathTo(1));
        System.out.println(dfs.pathTo(3));
        BreadthFirstSearch bfs = new BreadthFirstSearch(graph, 0);
        System.out.println(bfs.hasPathTo(7));
        System.out.println(bfs.hasPathTo(6));
        System.out.println(bfs.pathTo(3));
    }
}
