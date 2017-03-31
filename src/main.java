
public class main {

	public static void main(String[] args) {

		Stack pila = new Stack();
		
		if (pila.isEmpty()) System.out.println("Pila vacía");
		pila.apilar(1);
		if (pila.isEmpty()) System.out.println("Pila vacía");
		else System.out.println("Pila no vacía");
		pila.desapilar();
		if (pila.isEmpty()) System.out.println("Pila vacía");
		else System.out.println("Pila no vacía");
		
		System.out.println(pila.tope());
		
		System.out.println("Cargo la pila con Enteros");
		for (int i=0; i<10; i++){
			pila.apilar(i);
			System.out.println(pila.tope());
		}
		
		System.out.println("Vacío la pila");
		
		for (int i=0; i<10; i++){
			System.out.println(pila.tope());
			pila.desapilar();
		}
		
		if (pila.isEmpty()) {
			 System.out.println("Pila vacía");
		}
		

	}


}
