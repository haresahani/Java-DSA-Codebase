import java.util.ArrayList;
import java.util.List;

public class ArticulationPoint {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(List<List<Edge>> graph) {
        // Initialize each list in the graph
        for (int i = 0; i < graph.size(); i++) {
            graph.set(i, new ArrayList<Edge>());
        }

        // Add edges to the graph
        graph.get(0).add(new Edge(0, 1));
        graph.get(0).add(new Edge(0, 2));
        graph.get(0).add(new Edge(0, 3));

        graph.get(1).add(new Edge(1, 0));
        graph.get(1).add(new Edge(1, 2));

        graph.get(2).add(new Edge(2, 0));
        graph.get(2).add(new Edge(2, 1));

        graph.get(3).add(new Edge(3, 0));
        graph.get(3).add(new Edge(3, 4));

        graph.get(4).add(new Edge(4, 3));
    }

    public static void dfs(List<List<Edge>> graph, int curr, int parent, 
                           int[] discoveryTime, int[] low, int[] time, boolean[] visited) {
        visited[curr] = true;
        discoveryTime[curr] = low[curr] = ++time[0];
        int children = 0;

        for (Edge edge : graph.get(curr)) {
            int neighbor = edge.dest;

            if (neighbor == parent) {
                continue;
            }

            if (visited[neighbor]) {
                low[curr] = Math.min(low[curr], discoveryTime[neighbor]);
            } else {
                dfs(graph, neighbor, curr, discoveryTime, low, time, visited);
                low[curr] = Math.min(low[curr], low[neighbor]);

                if (parent != -1 && discoveryTime[curr] <= low[neighbor]) {
                    System.out.println("Articulation Point: " + curr);
                }

                children++;
            }
        }

        if (parent == -1 && children > 1) {
            System.out.println("Articulation Point: " + curr);
        }
    }

    public static void getAP(List<List<Edge>> graph, int V) {
        int[] discoveryTime = new int[V];
        int[] low = new int[V];
        int[] time = {0};
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(graph, i, -1, discoveryTime, low, time, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Edge>> graph = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        createGraph(graph);
        getAP(graph, V);
    }
}
