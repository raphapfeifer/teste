package br.com.teste.recursive;

public class Recursive {
	
	public int calcularRecursividade(int num){
		
		if(num == 0){
			return 1;
		}
		
		return num * calcularRecursividade(num-1);
		
	}

}
