
public class MySimpleLinkedList {
	protected Node first;
	private int size = 0;

	public MySimpleLinkedList() {
		first = null;

	}

	public boolean isEmpty() {
		return size == 0;
	}

	// ELIMINA UN NODO POR POSICION, Y VINCULA EL ANTERIOR CON EL SIGUIENTE
	public void deleteElement(int pos) {
		if (size - 1 > pos && first == null) {
			System.out.println("No borré nada");
		} else if (pos == 0) {
			first = first.getNext();
			size--;
		} else {
			if (size > pos || first == null) {
				Node nodo = at(pos - 1);
				if (nodo != null) {
					nodo.setNext(nodo.getNext().getNext());
					size--;
				}
			} else
				System.out.println("No hay nada en esa posición");
		}

	}

	public Node at(int pos) {
		Node nodo = null;
		if (size < pos - 1 || first == null) {
			System.out.println("No hay nada en esa posiciòn");
		} else {
			nodo = first;
			for (int i = 0; i < pos; i++) {
				nodo = nodo.getNext();
			}
		}
		return nodo;
	}

	public int getSize() {
		return size;
	}

	public void insertElementAtFirst(int num) {
		Node nodo = new Node(null, num);
		nodo.setNext(first);
		first = nodo;
		size++;
	}

}
