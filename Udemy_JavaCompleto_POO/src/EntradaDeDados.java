import java.util.Scanner;

public class EntradaDeDados
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String x; 
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		//DICA: sysout + ctrl backspoace: É realizado o preenchimento automático do comando abaixo.
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);
		
		sc.close();
	};
};
