public class Heap {
	Node root; 
	Node tail; 
	int count; 

	// Default constructor with null values;
	public Heap() {
		Node root = null;
		Node tail = null;
		int count = 0;
	}

	// constructor with initial node value given.
	public Heap(int value) {
		root = new Node(null, value);
		this.tail = root; 
		count = 1; 
	}

	public void insert(int value) {
		if (count == 0) { // Heap is empty, assign to root
			Node root = new Node(null, value);
			this.tail = root;
			count++;
		} else {
			// Balance tree based on value to be inserted

		}
	}

	public void remove(int value) {
		// TO DO : Remove a single instance of a node with the given value
	}

	public Node search(int findVal) {
		// TO DO : Search through the tree to find the specified value
		return null;
	}
}