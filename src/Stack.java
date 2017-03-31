public class Stack {
	
	MySimpleLinkedList lista = new MySimpleLinkedList();
	
	public Stack() {

	}

	public void apilar(int num) {
		this.lista.insertElementAtFirst(num);
	}

	public void desapilar() {
		this.lista.deleteElement(0);
	}

	public int tope(){
		
		try{
			return this.lista.at(0).getInfo();
		}
		catch (Exception e){
		}
		return 666;
		
		
	}

	public boolean isEmpty() {
		return this.lista.isEmpty();
	}
}
