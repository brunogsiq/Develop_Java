public class Variaveis {
	public static void main(String args[])
	{		
		System.out.println("Variáveis e Tipos de Dados.");
		System.out.println("Teremos as variáveis Primitivas:\n	byte,int, short, long(L), float(f), double, char, boolean");
		System.out.println("Lembrando que o tipo char declara-se: char 'B' ou seja, entre aspas simples.");
		System.out.println("Teremos as variáveis Não Primitivas:\n	String, Integer, Double, Objetos de Classes");

		byte tipoByte = 110;
		System.out.println(tipoByte);
		
		short tipoShot = 15000;
		System.out.println(tipoShot);
		
		int tipoInt = 35000;
		System.out.println(tipoInt);

		int numero_3 = 1000+100;
		System.out.println("int: ");
		System.out.println(numero_3);
		
		long tipoLong = 45000L;
		System.out.println(tipoLong);

		long numero_4 = 101719101719L;
		System.out.println("long: ");
		System.out.println(numero_4);
		
		float tipoFloat = 250.25f;
		System.out.println(tipoFloat);

		float numero_5 = 1017.1017f;
		System.out.println("float: ");
		System.out.println(numero_5);
		
		double tipoDouble = 52451.320;
		System.out.println(tipoDouble);

		double numero_6 = 101719.101719;
		System.out.println("double: ");
		System.out.println(numero_6);

		double num = numero_6;
		System.out.println("Incrementando um variável a outra: num = numero_6");
		System.out.println(num);
		
		char tipoChar = 'G';
		System.out.println(tipoChar);

		char letra = 'B';
		System.out.println("Imprimindo a letra: ");
		System.out.println(letra);
		
		boolean tipoBool = true;
		System.out.println(tipoBool);

		boolean verifica_1 = true;
		System.out.println("boolean_1:");
		System.out.println(verifica_1);

		boolean verifica_2 = false;
		System.out.println("boolean_2:");
		System.out.println(verifica_2);
		
		byte numero_1 = 100;
		System.out.println("byte: ");
		System.out.println(numero_1);
			
		short numero_2 = 100+100;
		System.out.println("short: ");
		System.out.println(numero_2);
		
		String nome_1 = "Bruno Siqueira";
		System.out.println("nome_1:");
		System.out.println(nome_1);
		
		String nome_2 = "@@@ Teste ###";
		System.out.println("nome_2:");
		System.out.println(nome_2);	
		
		final double pi = 3.141516;
		System.out.println("Imprimindo uma Constante, exemplo: Pi = 3.141516");
		System.out.println("NÃO ESQUECER: final double nome_var = valor;");
		System.out.println(pi);
	}
}