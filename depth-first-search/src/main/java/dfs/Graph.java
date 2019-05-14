package dfs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    
    private int adj_matrix[][];
    private int n_vertices;
    

    public Graph(int n_vertices){
        this.n_vertices = n_vertices;
        adj_matrix = new int [n_vertices][n_vertices];
        
        for (int row = 0; row < this.n_vertices; row++) {
            for (int col = 0; col < this.n_vertices; col++){
                adj_matrix[row][col] = 0;
            }
        }
        
    }

    public void add_edge(int v1, int v2, int weight){
        this.adj_matrix[v1][v2] = weight;
    }

    public void add_edge(int v1, int v2){
        this.adj_matrix[v1][v2] = 1;
    }

    public void remove_edge(int v1, int v2){
        this.adj_matrix[v1][v2] = 0;
    }

    // public List adj_list(int v1){
    //     List<Integer> adj = new ArrayList<>();
    //     for (int col = 0; col < this.n_vertices; col++) {
    //         if (this.adj_matrix[v1][col] > 0) {
    //             adj.add(col);
    //         }           
    //     }

    //     return adj;        
    // }

    public boolean theres_edge(int v1, int v2){
        return (this.adj_matrix[v1][v2] > 0);
    }

    public void print_adj_matrix(){
        for (int i = 0; i < this.n_vertices; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < this.n_vertices; j++) {
                System.out.print(adj_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void DFS(){
        boolean visited[];

        visited = new boolean [this.n_vertices];
        for (int row = 0; row < this.n_vertices; row++) {
            visited[row] = false;
        }

        for (int i = 0; i < this.n_vertices; i++) {
            if(visited[i] == false){
                DFS_util(i, visited);
                System.out.println("end");
            }
        }
        //System.out.println();
    }

    public void DFS_util(int vertice, boolean visited[]){
        visited[vertice] = true;
        System.out.print(vertice + " -> ");

        for(int j=0; j<this.n_vertices; j++){
            if(visited[j] == false && this.adj_matrix[vertice][j] == 1){
                DFS_util(j, visited);
                System.out.print("b" +vertice + " -> ");
                //System.out.print(j + " -> ");
            }
        }
         
        //System.out.println();
    
    }

}