### 5. Objeto  
Em Java, um **objeto** é uma instância de uma classe. Ele contém atributos e métodos.  

```java
public class Carro {
    String modelo;
    int ano;

    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Ferrari";
        meuCarro.ano = 2023;
        meuCarro.mostrarInfo();
    }
}
```

Cada objeto criado a partir da classe `Carro` terá seus próprios valores para `modelo` e `ano`.

Esses são os conceitos básicos de Java! Alguma dúvida ou quer mais detalhes sobre algum deles? 🚀