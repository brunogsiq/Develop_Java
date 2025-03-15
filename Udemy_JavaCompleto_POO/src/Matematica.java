
public class Matematica {

	public static void main(String[] args) {
		/* Explicação
		 * A = Math.sqrt(x);   = Variavel A recebe raíz quadrada de x
		 * A = Math.pow(x, y); = Variável A recebe o resultado de x elevado a y
		 * A = Math.abs(x);    = Variável A recebe o valor absoluto de x
		 * 
		 * Segue exemplos:
		 */
		
		double A = 2.0;
		double B = 4.0;
		double C = 8.0;
		double D = 16.0;
		
		A = Math.sqrt(B);
		B = Math.sqrt(C);
		
		System.out.println("Raíz quadrada de " + A + " = " + A );
		System.out.println("Raíz quadrada de " + B + " = " + B );
		
		A = Math.pow(B, C);
		B = Math.pow(C, D);
		
		System.out.println("O Valor é " + A);
		System.out.println("O valor é " + B);
		
		//Exemplo: Delta = bxb -4ac
		
		double delta;
		
		delta = Math.pow(B, 2.0) -4*A*C;
	};
};