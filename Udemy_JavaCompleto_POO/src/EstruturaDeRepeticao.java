
public class EstruturaDeRepeticao
{
	public static void main(String[] args)
	{
		//Estrutura de Repetição (Loops) - As estruturas de repetição permitem executar um bloco de código várias vezes.

		//for` (quando se sabe o número de repetições)  
		for (int i = 0; i < 5; i++)
		{
		    System.out.println("Repetição: " + i);
		};

		//while` (enquanto a condição for verdadeira)  
		int i = 0;
		while (i < 5)
		{
		    System.out.println("Repetição: " + i);
		    i++;
		};

		//do-while` (garante pelo menos uma execução)  
		i = 0;
		do {
		    System.out.println("Repetição: " + i);
		    i++;
		} while (i < 5);

	};
};
