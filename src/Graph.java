import java.util.ArrayList;

/**
 * @author Georges
 *
 */

public class Graph {
	
	/* attributes */
    private ArrayList<Node> nodes;
    public static int maxDistance = Integer.MAX_VALUE;
    
    /**
     * Graph constructor
     * @param nodes ArrayList<Node> of all the nodes contained in the graph
     */
    public Graph(ArrayList<Node> nodes) {
    	this.nodes = nodes;
    }
    
    /**
     * adds an edge between two Nodes in the graph
     * @param nodeNameA name of the Node A
     * @param nodeNameB name of the Node B
     * @param distance distance between both Nodes
     */
    public void addEdgeBetween(String nodeNameA, String nodeNameB, int distance) {
    	Node nodeA = this.getNodeByName(nodeNameA);
    	Node nodeB = this.getNodeByName(nodeNameB);
    	
    	// let's add to both nodes, since the graph isnt oriented
    	nodeA.addEdgeTo(nodeB, distance);
    	nodeB.addEdgeTo(nodeA, distance);
    } 
    
    /**
     * Searches recursively in the graph to find the path between two Nodes
     * @param from Node from where the message is emmitted
     * @param dest Node where the message is heading
     * @param pr PathResult object containing the current infos on the search
     * @return PathResult containing the result of the search
     */
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
    
    /**
     * wrapper function for cleaner recursiveSearch prints etc
     * @param nodeNameA name of the node A
     * @param nodeNameB name of the node B
     */
    public void sendMessageBetween(String nodeNameA, String nodeNameB) {
    	Node src = this.getNodeByName(nodeNameA);
    	Node dest = this.getNodeByName(nodeNameB);
		
    	System.out.println("Sending message between " + src.getName() + " and " + dest.getName());
		PathResult pathResult = this.recursiveSearch(src, dest, new PathResult());
    	
    	System.out.println(pathResult.toString());
    	
    }
    
    /**
     * prints all Nodes in graph, debug purpose
     */
    public void printAllNodes() {
    	for(Node n : this.nodes) {
    		System.out.println(n.toString());
    	}
    }
    
    /**
     * utility function to retrieve a Node by its name
     * @param name name of the Node we are looking for
     * @return Node corresponding to name
     */
    private Node getNodeByName(String name) {
    	for(Node n : this.nodes) {
    		if(name.equals(n.getName())) {
    			return n;
    		}
    	}
    	return null;
    }
}
