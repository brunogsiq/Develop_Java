/*
    O que é uma classe?
        Estrutura que permite agrupar instruções, informações, dados.
        Ex:
            public class Main
            {
                //código, instrução...
            }

        A class Main, poderá possuir um metódo chamado main.
        Ex:
            public class Main
            {
                public static void main(String[] args)
                {
                    //código, instrução...
                }
            }

    Criando uma classe no projeto:
            Após projeto criado, src > New > Class
                Package ficará em branco
                Nome da classe: Main
                Marque como public static void (String[] arg)
 */

//pública, para ser acessada por outras instâncias
    //class, tipo
        //Main, nome da classe, o nome da classe deve refletir seu propósito.
public class Main
{
    //public, sem restrições de acesso.
        //static, metódo main pertence a classe em si, não é algo específico.
            //void, não haverá retorno do nosso metódo.
                //main, nome do nosso metódo.
    public static void main(String[] args)
    {
        System.out.println("Olá Mundo");
    }
}