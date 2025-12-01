import java.util.*;
import java.util.LinkedList;
public class BFS {
    private Map<Integer,List<Integer>> adjacentList=new HashMap<>();
    public void addNode(int data){
        adjacentList.putIfAbsent(data, new ArrayList<>());
    }
    public void addEdge(int v, int u){
        adjacentList.get(v).add(u);
        adjacentList.get(u).add(v);
    }
    public void bfs(int data){
        Queue<Integer> queue=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        queue.add(data);
        visited.add(data);
        System.out.print("BFS:");
        while (!queue.isEmpty()) {
            int current=queue.poll();
            System.out.println(current+" ");
            for(int neighbour:adjacentList.get(current)){
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BFS bfs=new BFS();
        bfs.addNode( 1);
        bfs.addNode( 2);
        bfs.addNode( 3);
        bfs.addNode( 4);
        bfs.addNode( 5);
        bfs.addNode( 6);
        bfs.addEdge(1, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(2, 4);
        bfs.addEdge(2, 5);
        bfs.addEdge(3, 6);
        bfs.bfs(1);
    }
}