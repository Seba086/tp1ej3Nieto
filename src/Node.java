public class Node {

	private Node next;
	private Integer nro;
	

	public Node(Node n, int i) {
		next = n;
		nro = i;
	}

	public void setNext(Node i) {
		next = i;
	}

	public void setNro(Integer i) {
		nro = i;
	}

	public int getInfo() {
		return nro;
	}

	public Node getNext() {
		return next;
	}
	
}