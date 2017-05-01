package br.com.teste.testeRecursividade;

import br.com.teste.recursive.Recursive;

public class TestaRecursive {

	public static void main(String[] args) {
		
		int resultado = 0;
		Recursive recursive = new Recursive();
		
		resultado = recursive.calcularRecursividade(5);
		
		System.out.println(resultado);
	}

}
