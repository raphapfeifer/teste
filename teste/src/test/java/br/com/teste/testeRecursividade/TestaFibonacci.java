package br.com.teste.testeRecursividade;

import br.com.teste.recursive.Fibonacci;

public class TestaFibonacci {

	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		
		for(int i=0;i<10;i++){
			
			System.out.println(fibonacci.calculaFibonacci(i));
		}
		
		

	}

}
