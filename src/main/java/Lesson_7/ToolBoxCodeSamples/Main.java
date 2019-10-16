package Lesson_7.ToolBoxCodeSamples;

public class Main {
    public static void main(String[] args) {
        MyGraph graph = new MyGraph(5);
        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        System.out.println(graph.toString());
        System.out.println(graph.getAdjList());
    }
}
