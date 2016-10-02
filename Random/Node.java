public class Node {
	Node parent;
	Node rChild;
	Node lChild;
	int value;

	// Default constructor with no values
	public Node() {
		parent=null;
		rChild=null;
		lChild=null;
		value=0;
	}

	// Constructor with setters for parent and value;
	public Node(Node parent, int value) {
		this.parent = parent;
		this.value = value;
		this.rChild = null;
		this.lChild = null; 
	}

	// Constructor with setters for all variables. For sake of completeness.
	public Node(Node parent, Node rChild, Node lChild, int value) {
		this.parent = parent;
		this.rChild = rChild;
		this.value = value;
		this.lChild = lChild;
	}

	// Setter and getter for variable: Value
	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	// Setter and getter for variable: Parent
	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getParent() {
		return this.parent;
	}

	// Setter and getter for variable: rChild
	public void setrChild(Node child) {
		this.rChild = rChild;
	} 

	
	public Node getrChild() {
		return this.rChild;
	}

	// Setter and getter for variable: lChild
	public void setlChild(Node child) {
		this.lChild = lChild;
	} 

	public Node getlChild() {
		return this.lChild;
	}
}