
//📌 Estrutura de um Método com Retorno - Se precisar que o método retorne um valor, basta trocar void por um tipo de dado, como String:

public class MetodoComRetorno
{
    // Método que retorna um texto
    public static String MetodoComRetorno()
    {
        return "Este é o método chamado Metodo.";
    };

    public static void Teste02(String[] args)
    {
        String resultado = MetodoComRetorno(); // Chamando o método e armazenando o resultado
        System.out.println(resultado);
    };
};