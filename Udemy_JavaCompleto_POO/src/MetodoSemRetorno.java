
/*
	📌 Explicação da Estrutura
	🔹 public → Torna o método acessível em qualquer lugar.
	🔹 static → Permite chamar o método sem precisar instanciar a classe.
	🔹 void → Indica que o método não retorna nenhum valor.
	🔹 Metodo() → Nome do método (sempre com parênteses).
	🔹 System.out.println("..."); → Comando que imprime algo na tela.
	🔹 main(String[] args) → Método principal que executa o programa.
*/

public class MetodoSemRetorno
{
    // Declaração do método chamado "Metodo"
    public static void MetodoSemRetorno()
    {
        // Corpo do método (o que ele faz)
        System.out.println("Este é o método chamado Metodo.");
    };

    // Método main para executar o código
    public static void Teste01(String[] args)
    {
        MetodoSemRetorno(); // Chamando o método dentro do main
    };
};