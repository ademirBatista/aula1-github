package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");/* adiciona um elemento na posição 2 do vetor*/
		System.out.println(list.size());
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		list.removeIf(x -> x.charAt(0) == 'M');/* remove os elementos que começa com M maiusculo*/
		for (String x : list) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		/* mostra a posição em que o elemento bob esta*/
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		/* se nao tiver no caso como o marco ele mostra -1*/
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
		/*filtra todo elemento que começa pela letra A e retorna pra lista*/
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
		System.out.println(x);
		}
		System.out.println("---------------------");
		/* pega todo o primeiro elemento que começa pelaletra selecionada,
		 se ele nao existir retorna nulo */
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		}

	}

