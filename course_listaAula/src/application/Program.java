package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(); // Lista não aceita tipo primitivo

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// Adicionar item na lista ==> adicionar "Marco" na posição "2"
		list.add(2, "Marco"); //list.add("posição", "Nome do elemento a ser adicionado")

		System.out.println(list.size()); // Ver/obter o tamanho da lista
		for (String x : list) {
			System.out.println(x);
			
		}
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();

		list.remove(1); // Remove pela posição na lista
		list.remove("Maria"); // Remove pelo nome do item da lista
		list.removeIf(x -> x.charAt(0) == 'M');
		//remover todo o string "x" tal que "x.charAt(0)" 
		//seja igual a "M" (É uma função lambda ou predicado)
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("----------------------------------");
		System.out.println("Index of Bob " + list.indexOf("Bob"));//Localizar a posição de um item da lista
		//Quando o indexOf não encontra nenhum elemento ele retorna "-1"
		
		System.out.println("----------------------------------");
		
		list.add("Maria");
		list.add("Alex");
		list.add(2, "Marco");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------");

		List<String> resultado = list.stream().filter(x -> x.charAt(0) 
							== 'A').collect(Collectors.toList()); 
		//Declarar uma lista "resultado" para armazenar o filtro
		//Retornar os itens que começam com "A"
		//Manter a compatibilidade com tipo list antigo e conseguir executar a função lambda 
		//list.stream = converter de list para stream
		//.collect(Collectors.toList() = converter stream para list
		
		for (String x : resultado) {
			System.out.println(x);
		}
		
		list.add("Maria");
		list.add(2, "Marco");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------------------------");

		String nome = list.stream().filter(x -> x.charAt(0) == 'S').findFirst().orElse(null);
		//.findFirst() este comando que aponta para o primeiro elemento que está sendo requisitado no ".filter"
		//Mostrar o primeiro nome que começa com a letra "A" se não encontrar ele retorna nulo ".orElse(null)"
		System.out.println(nome);
		

		
		
		

	}

}
