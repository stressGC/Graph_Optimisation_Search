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
    
    private PathResult recursiveSearch(Node from, Node dest, PathResult pr) {
    	pr.addNode(from);
    	// we got dest directly from here
    	if(from.hasDestinationAsNeighbor(dest)) {
    		pr.addNode(dest);
    		return pr;
    	}
    	
    	Node nextNode = from.getNextNode();
    	
    	return recursiveSearch(nextNode, dest, pr);
    }
    
    public void sendMessageBetween(String nodeNameA, String nodeNameB) {
    	Node src = this.getNodeByName(nodeNameA);
    	Node dest = this.getNodeByName(nodeNameB);
		
    	System.out.println("Sending message between " + src.getName() + " and " + dest.getName());
		PathResult pathResult = this.recursiveSearch(src, dest, new PathResult());
    	
    	System.out.println(pathResult.toString());
    	
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
