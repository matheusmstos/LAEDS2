package dfs;

public class Test{
    public static void main(String[] args) {
        Graph g1 = new Graph(10);

        g1.add_edge(0,1);
        g1.add_edge(0,2);
        g1.add_edge(0,3);
        g1.add_edge(0,5);
        g1.add_edge(1,2);
        g1.add_edge(2,3);
        g1.add_edge(2,4);   
        g1.add_edge(4,6);
        g1.add_edge(5,4);
        g1.add_edge(5,6);
        g1.add_edge(6,7);
        g1.add_edge(6,8);
        g1.add_edge(7,8);
        g1.add_edge(9,6);
        g1.add_edge(5,0);
        

        g1.DFS();
        //g1.print_adj_matrix();
    }
}