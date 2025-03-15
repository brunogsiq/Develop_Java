public class Pessoa
{
    String nome; // Criando um atributo para armazenar o nome

    // Construtor opcional
    public Pessoa(String nome)
    {
        this.nome = nome;
    };

    // Método opcional para exibir o nome
    public void exibirNome()
    {
        System.out.println("Nome da pessoa: " + nome);
    };
};
