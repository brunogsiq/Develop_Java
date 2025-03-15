
public class EstruturaDeDecisao
{
	public static void main(String[] args)
	{
		//Estrutura de Decisão (Condicionais) - As estruturas de decisão são usadas para executar blocos de código com base em condições.  

		//if-else`  
		int numero = 10;
		if (numero > 0)
		{
		    System.out.println("Número positivo");
		} else if (numero < 0) {
		    System.out.println("Número negativo");
		} else {
		    System.out.println("Número é zero");
		};
		
		//switch-case`  
		int dia = 3;
		switch (dia)
		{
		    case 1:
		        System.out.println("Domingo");
		        break;
		    case 2:
		        System.out.println("Segunda-feira");
		        break;
		    case 3:
		        System.out.println("Terça-feira");
		        break;
		    default:
		        System.out.println("Outro dia");
		};
	};
};
