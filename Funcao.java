package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		// A saida de um método deve ser entrada para outro.
		
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor +"!!!";
		
		Function<String, String> duvida = valor -> valor +"???";
		
		
		
		System.out.println(parOuImpar.apply(32));
		
		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		
		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(32);
		
		System.out.println(resultadoFinal1);
		System.out.println(resultadoFinal2);
	}

}
