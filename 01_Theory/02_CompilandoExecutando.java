public class _01_PrimeirasLinhasDeComando {

    public static void main(String[] args) {
        /*
         * System.out.print - NÃO PULA LINHA;
         * System.out.println - PULA 1 LINHA;
         */

        System.out.println("Exemplo 1!!!");
        System.out.println("Nossa Primeira e Segunda Linhas de Comando em Java");
        System.out.println("javac nomeDoArquivo.java = Compila");
        System.out.println("java nomeDoArquivo = Executa");

        // Lendo um número do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        // Imprimindo o número digitado
        System.out.println("O número digitado foi: " + numero);
    }
}