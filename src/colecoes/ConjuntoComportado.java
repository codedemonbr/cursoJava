package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<String>();
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Pedro");
		listaAprovados.add("Maria");

		for (String item : listaAprovados) {
			System.out.println(item);
		}

		Set<Integer> nums = new HashSet<>();// nao é possivel acessar pelo indice
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		for (Integer num : nums) {
			System.out.println(num);
		}
	}

}
