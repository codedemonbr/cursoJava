package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<>();

//		a diferenca ocorre quando fila está cheia
		System.out.println(fila.add("Ana"));
		System.out.println(fila.offer("Bia"));
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Joao");
		fila.offer("Maria");

		// A diferenca ocorre quando a fila está vazia
//		System.out.println(fila.peek());
//		System.out.println(fila.peek());
//		System.out.println(fila.element());
//		System.out.println(fila.element());

		
		// diferenca esta quando a fila está vazia
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
//		System.out.println(fila.remove());// lanca uma exception

	}

}
