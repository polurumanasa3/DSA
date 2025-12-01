import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFS {
    private Map<Integer, List<Integer>> adjacentList = new HashMap<>();

    public void addNode(int data) {
        adjacentList.putIfAbsent(data, new ArrayList<>());
    }

    public void addEdge(int v, int u) {
        adjacentList.putIfAbsent(v, new ArrayList<>());
        adjacentList.putIfAbsent(u, new ArrayList<>());
        adjacentList.get(v).add(u);
        adjacentList.get(u).add(v);
    }

    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        if (!adjacentList.containsKey(start)) {
            System.out.println("Start node not found!");
            return;
        }
        dfsHelper(start, visited);
    }

    private void dfsHelper(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbour : adjacentList.get(node)) {
            if (!visited.contains(neighbour)) {
                dfsHelper(neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS();

      
        for (int i = 1; i <= 6; i++) {
            graph.addNode(i);
        }

       
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 6);

        System.out.println("DFS Traversal starting from node 1:");
        graph.dfs(1);
    }
}