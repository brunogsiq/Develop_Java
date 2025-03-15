//Importando Biblioteca para padrão Americano;
import java.util.Locale;

public class TiposDeDados
{

	public static void main(String[] args)
	{
		String product1 = "Computer";
		String product2 = "Office desk";

		System.out.println("Products:");
		System.out.println();
		
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();

		double price1 = 2100.0;
		double price2 = 650.50;
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		
		double measure = 53.234567;

		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f%n", measure);

		Locale.setDefault(Locale.US);
		double x = 10.35784;
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
	};
};