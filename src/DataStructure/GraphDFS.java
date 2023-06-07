package DataStructure;

import java.util.*;
public class GraphDFS {
    ArrayList<NodeDFS> nodes;
    int[][] matrix;

    public GraphDFS(int size) {
        this.nodes = new ArrayList<>();
        this.matrix = new int[size][size];
    }

    public void addNode(NodeDFS node){
        nodes.add(node);
    }

    public  void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }
//print matrix
    void print(){
        System.out.println(" ");
        for(NodeDFS node : nodes){
            System.out.print(node.data + " ");
        }

        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
     //DFS
     public void depthFirstSearch(int src){
            boolean[] visited  = new boolean[matrix.length];
            dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {
        if(visited[src]){
            return;
        }else{
            visited[src] = true;
            System.out.println(nodes.get(src).data + " - visited");
        }

        for(int i = 0; i < matrix[src].length; i++){
            if(matrix[src][i]==1){dFSHelper(i,visited);}
        }
    }

    public static void main(String[] args) {
        GraphDFS  graph = new GraphDFS(7);
        graph.addNode(new NodeDFS('N'));
        graph.addNode(new NodeDFS('W'));
        graph.addNode(new NodeDFS('H'));
        graph.addNode(new NodeDFS('X'));
        graph.addNode(new NodeDFS('T'));
        graph.addNode(new NodeDFS('A'));
        graph.addNode(new NodeDFS('K'));

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(1,5);
        graph.addEdge(3,6);

        graph.print();
        graph.depthFirstSearch(0);
    }
}

class NodeDFS{
    char data;
    NodeDFS(char data){
        this.data = data;
    }
}