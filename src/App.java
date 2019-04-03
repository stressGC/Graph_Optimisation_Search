import java.util.ArrayList;

/**
 * @author Georges
 *
 */
public class App {

	/**
	 * @param args
	 */
    public static void main(String args[]) 
    { 
    	// create our nodes
    	ArrayList<Node> nodes = new ArrayList<Node>();
    	
    	for(int i = 1; i < 11; i++) {
    		String nodeName = GetLetter(i);
    		Node newNode = new Node(nodeName);
    		nodes.add(newNode);
    	}
    	
        // create the graph given in above figure
    	Graph graph = new Graph(nodes);
    	
    	
    	graph.addEdgeBetween("A", "B", 50);
    	
    	graph.printAllNodes();
    	
        /*int numberOfVertices = 5; 
        Graph graph = new Graph(numberOfVertices); 
        graph.addEdge(0, 1); 
        graph.addEdge(0, 4); 
        graph.addEdge(1, 2); 
        graph.addEdge(1, 3); 
        graph.addEdge(1, 4); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 4); */
       
        // print the adjacency list representation of  
        // the above graph 
        //graph.print();
    } 
    
    /**
     * used to get the nth letter of alphabet
     * https://stackoverflow.com/questions/20882656/how-to-get-nth-letter-of-english-alphabet 
     * 
     * @param int: index in alphabet
     */
    private static String GetLetter(int value)
    {
        char resAsChar = (char) ('A' - 1 + value);
        return String.valueOf(resAsChar);
    }

}
