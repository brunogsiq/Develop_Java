import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados Digitados: ");
		System.out.println("primeiro: " + s1);
		System.out.println("segundo: " + s2);
		System.out.println("terceiro: " + s3);
		
		sc.close();		
	};
};