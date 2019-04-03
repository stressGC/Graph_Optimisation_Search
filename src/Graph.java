import java.util.LinkedList;

/**
 * @author Georges
 *
 */

public class Graph {
	  private int verticesNumber; 
      private LinkedList<Integer> graph[];
      
      public Graph(int verticesNumber) {
    	  this.verticesNumber = verticesNumber;
    	  
    	  this.graph = new LinkedList[verticesNumber];
    	  
    	  for(int i = 0; i < verticesNumber ; i++){ 
              this.graph[i] = new LinkedList<>(); 
          } 
      }
      
      public void addEdge(int src, int dest) {
    	/* Add an edge from src to dest.  */
        this.graph[src].add(dest); 
            
        /* Since graph is undirected, add an edge from dest too */
        this.graph[dest].add(src); 
      }
      
      // A utility function to print the adjacency list  
      // representation of graph 
      public void printGraph() 
      {        
          for(int v = 0; v < this.verticesNumber; v++) 
          { 
              System.out.println("Adjacency list of vertex "+ v); 
              System.out.print("head"); 
              for(Integer pCrawl : this.graph[v]){ 
                  System.out.print(" -> "+ pCrawl); 
              } 
              System.out.println("\n"); 
          } 
      } 
}
