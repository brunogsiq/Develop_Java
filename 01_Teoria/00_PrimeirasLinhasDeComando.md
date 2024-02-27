## Anotações sobre Java em Markdown

**Introdução:**

- Java é uma linguagem de programação orientada a objetos e multiplataforma.
- O código Java é compilado para bytecode, que é interpretado por uma máquina virtual chamada JVM (Java Virtual Machine).
- Para programar em Java, você precisa baixar o JDK (Java Development Kit), um editor de texto e o prompt de comando (CMD).

**Comandos básicos:**

- `java -version`: verifica a versão do Java instalada.
- `javac nome_do_arquivo.java`: compila o arquivo Java.
- `java nome_do_arquivo`: executa o arquivo Java.

**Imprimindo mensagens na tela:**

- `System.out.print("Mensagem")`: imprime a mensagem sem pular linha.
- `System.out.println("Mensagem")`: imprime a mensagem e pula uma linha.

**Lendo dados do usuário:**

- Importe a biblioteca `java.util.Scanner`.
- Crie um objeto `Scanner` com o comando `Scanner nomeDoObjeto = new Scanner(System.in)`.
- Utilize o objeto `nomeDoObjeto` para ler dados do usuário, por exemplo:

```java
int numero = nomeDoObjeto.nextInt();
String nome = nomeDoObjeto.nextLine();
```

**Principais estruturas de dados:**

- Vetores e matrizes (arrays)
- Registros
- Filas
- Pilhas
- Árvores
- Tabelas hash
- Grafos

**Exemplo de código:**

```java
public class Comentarios
{
	// Metódo principal do programa
	public static void main(String args[])	
	{

		//* variaveis para guardas os valores dos operandos e do resultado da operação

		int num1 = 4;
		int num2 = 4;
		int resultado = 0;

		// Realizar a operação matermática
		resultado = num1 + num2 / 2;

		// Imprimir o resultado na tela
		System.out.println("O resultado um é: " + resultado);

		//resultado = (num1 + num2) / 2;
		//System.out.println("O resultado dois é: " + resultado);
	}
}
```