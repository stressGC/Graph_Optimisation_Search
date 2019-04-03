import java.util.ArrayList;

/**
 * @author Georges
 *
 */

public class Graph {
    private ArrayList<Node> nodes;
    
    public Graph(ArrayList<Node> nodes) {
    	this.nodes = nodes;
    }
    
    public void addEdgeBetween(String nodeNameA, String nodeNameB, int distance) {
    	Node nodeA = this.getNodeByName(nodeNameA);
    	Node nodeB = this.getNodeByName(nodeNameB);
    	
    	// let's add to both nodes, since the graph isnt oriented
    	nodeA.addEdgeTo(nodeB, distance);
    	nodeB.addEdgeTo(nodeA, distance);
    }
    
    public void printAllNodes() {
    	for(Node n : this.nodes) {
    		System.out.println(n.toString());
    	}
    }
    
    private Node getNodeByName(String name) {
    	for(Node n : this.nodes) {
    		if(name.equals(n.getName())) {
    			return n;
    		}
    	}
    	return null;
    }
}
