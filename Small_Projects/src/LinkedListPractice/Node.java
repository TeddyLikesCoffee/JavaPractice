package LinkedListPractice;

public class Node {
	private Node nextNode;
	private int data;

	// 0-arg constructor, 1-arg constructor, 2-arg constructor
	public Node() { }
	
	public Node(int val) {
		data = val;
	}
	
	public Node(int val, Node next) {
		data = val;
		nextNode = next;
	}
	
	public void setData(int val) {
		this.data = val;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setNextNode(Node n) {
		this.nextNode = n;
	}
	
	public Node getNextNode() {
		return this.nextNode;
	}
	
}
