import java.util.Locale;

public class Main 
{
	public static void main(String[] args) 
	{
		System.out.print("Olá mundo! ");
		System.out.println("Tudo bem?");
		double valor = 1.091910;
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", valor);
		System.out.printf("%.4f%n", valor);
	}
}
