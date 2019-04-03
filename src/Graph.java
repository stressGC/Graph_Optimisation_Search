import java.util.LinkedList;

/**
 * @author Georges
 *
 */

public class Graph {
    private LinkedList<Node> nodes;
    
    public Graph(LinkedList<Node> nodes) {
    	this.nodes = nodes;
    }
    
    public void printAllNodes() {
    	for(Node n : nodes) {
    		System.out.println(n.toString());
    	}
    }
}
