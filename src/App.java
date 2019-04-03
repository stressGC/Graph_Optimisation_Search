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
    	
    	// 7 = till 'F'
    	for(int i = 1; i < 7; i++) {
    		String nodeName = GetLetter(i);
    		Node newNode = new Node(nodeName);
    		nodes.add(newNode);
    	}
    	
        // create the graph given in above figure
    	Graph graph = new Graph(nodes);
    	
    	/* from A */
    	graph.addEdgeBetween("A", "B", 50);
    	graph.addEdgeBetween("A", "C", 60);
    	graph.addEdgeBetween("A", "E", 40);
    	graph.addEdgeBetween("A", "F", 55);
    	
    	/* from B */
    	graph.addEdgeBetween("B", "D", 35);
    	graph.addEdgeBetween("B", "E", 20);
    	
    	/* from C */
    	graph.addEdgeBetween("C", "D", 80);
    	graph.addEdgeBetween("C", "E", 70);
    	
    	/* from D */
    	graph.addEdgeBetween("D", "E", 45);
    	graph.addEdgeBetween("D", "F", 65);
    	
    	/* print all for debugging purpose */
    	graph.printAllNodes();
  
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
