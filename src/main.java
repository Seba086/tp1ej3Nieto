
public class main {

	public static void main(String[] args) {

		Stack pila = new Stack();
		
		if (pila.isEmpty()) System.out.println("Pila vac�a");
		pila.apilar(1);
		if (pila.isEmpty()) System.out.println("Pila vac�a");
		else System.out.println("Pila no vac�a");
		pila.desapilar();
		if (pila.isEmpty()) System.out.println("Pila vac�a");
		else System.out.println("Pila no vac�a");
		
		System.out.println(pila.tope());
		
		System.out.println("Cargo la pila con Enteros");
		for (int i=0; i<10; i++){
			pila.apilar(i);
			System.out.println(pila.tope());
		}
		
		System.out.println("Vac�o la pila");
		
		for (int i=0; i<10; i++){
			System.out.println(pila.tope());
			pila.desapilar();
		}
		
		if (pila.isEmpty()) {
			 System.out.println("Pila vac�a");
		}
		

	}


}
