# 📘 **Guia Completo de Java para Automação com Selenium**

### *Funções, Métodos, Classes, Page Objects e Exemplos Avançados*

---

# 🟦 **1. Diferença entre Função e Método**

## 🔹 **Função**

É um bloco de código que **RETORNA um valor**.
Em Java, toda função precisa estar dentro de uma classe (pois Java é 100% orientado a objetos).

### ✔ Exemplo:

```java
public int somar(int a, int b) {
    return a + b;
}
```

---

## 🔹 **Método**

É uma ação de uma classe/objeto.
Pode **retornar ou não retornar** valor.

### ✔ Exemplo:

```java
public void clicarBotao() {
    System.out.println("Cliquei!");
}
```

---

## 🔹 Resumo Rápido

| Nome       | Retorna valor?       | Fica dentro de classe? | Representa                    |
| ---------- | -------------------- | ---------------------- | ----------------------------- |
| **Função** | Sempre retorna       | Sim                    | Cálculo, busca, transformação |
| **Método** | Pode ou não retornar | Sim                    | Ação, comportamento           |

---

# 🟦 **2. Java Básico Necessário para Selenium**

## 🔹 **Variáveis**

```java
String nome = "Bruno";
int idade = 30;
boolean ativo = true;
```

---

## 🔹 **Classe**

Uma classe representa um objeto, tela ou utilitário.

```java
public class Pessoa {
    String nome;
    int idade;
}
```

---

## 🔹 **Construtor**

```java
public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}
```

---

## 🔹 **Criar objeto**

```java
Pessoa p = new Pessoa("Bruno", 30);
```

---

## 🔹 **Importar classe de outro arquivo**

```java
import br.com.projeto.Pessoa;
```

---

## 🔹 **Método dentro de classe**

```java
public void apresentar() {
    System.out.println("Olá, eu sou " + nome);
}
```

---

## 🔹 **Função dentro de classe**

```java
public int getIdade() {
    return idade;
}
```

---

# 🟦 **3. Quando criar Classe, Função ou Método**

## 🔹 **Quando criar uma classe?**

Use classe quando quiser representar:

* uma página (LoginPage, HomePage)
* um objeto (Pessoa, Produto)
* lógica agrupada (DriverFactory, Utils)
* testes organizados (LoginTest, CompraTest)

---

## 🔹 **Quando criar um método?**

Método é uma **ação**.

Use quando quiser:

* clicar
* preencher campo
* fazer login
* navegar
* esperar elemento
* encapsular comportamento

```java
public void preencherUsuario(String user) {}
```

---

## 🔹 **Quando criar uma função?**

Função **retorna algo**.

Use quando quiser:

* pegar texto do DOM
* pegar URL da página
* validar mensagens
* fazer cálculos
* gerar massa de teste

```java
public String obterMensagemErro() {}
```

---

# 🟦 **4. Page Objects — Estrutura Avançada**

## 📂 Estrutura recomendada (Selenium + JUnit)

```
src
 └── test
      └── java
           └── br.com.projeto
                ├── pages
                │    ├── LoginPage.java
                │    └── InventoryPage.java
                └── tests
                     └── LoginTests.java
```

---

# 🟩 **LoginPage.java — Exemplo avançado de Page Object**

```java
package br.com.projeto.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By logo = By.className("login_logo");
    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public LoginPage abrirPagina() {
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    public LoginPage aguardarCarregamento() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
        return this;
    }

    public LoginPage informarUsuario(String usuario) {
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(usuario);
        return this;
    }

    public LoginPage informarSenha(String senha) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(senha);
        return this;
    }

    public InventoryPage clicarEmLoginComSucesso() {
        driver.findElement(loginButton).click();
        return new InventoryPage(driver);
    }

    public LoginPage clicarEmLoginComErro() {
        driver.findElement(loginButton).click();
        return this;
    }

    public String obterMensagemDeErro() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        return driver.findElement(errorMessage).getText();
    }

    public boolean logoEstaVisivel() {
        return driver.findElement(logo).isDisplayed();
    }
}
```

---

# 🟩 **InventoryPage.java**

```java
package br.com.projeto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {

    private WebDriver driver;

    private By tituloPagina = By.className("title");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String obterTitulo() {
        return driver.findElement(tituloPagina).getText();
    }

    public boolean paginaCarregou() {
        return driver.findElement(tituloPagina).isDisplayed();
    }
}
```

---

# 🟧 **LoginTests.java — Testes Limpíssimos**

```java
package br.com.projeto.tests;

import br.com.projeto.pages.InventoryPage;
import br.com.projeto.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTests {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);
        loginPage.abrirPagina().aguardarCarregamento();
    }

    @AfterEach
    void teardown() {
        if (driver != null) driver.quit();
    }

    @Test
    void testLoginSucesso() {
        InventoryPage inventario = loginPage
                .informarUsuario("standard_user")
                .informarSenha("secret_sauce")
                .clicarEmLoginComSucesso();

        Assertions.assertEquals("Products", inventario.obterTitulo());
    }

    @Test
    void testLoginErro() {
        loginPage
            .informarUsuario("standard_user")
            .informarSenha("senha_errada")
            .clicarEmLoginComErro();

        Assertions.assertTrue(
            loginPage.obterMensagemDeErro().contains("Username and password do not match")
        );
    }
}
```

---

# 🟦 **5. Exemplos Avançados**

## 🔥 Fluent Interface (encadeamento profissional)

```java
loginPage
    .abrirPagina()
    .informarUsuario("bruno")
    .informarSenha("123")
    .clicarEmLoginComErro();
```

---

## 🔥 Criando DriverFactory (para evitar repetir código)

```java
public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
```

---

## 🔥 BaseTest (todos os testes herdam)

```java
public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void teardown() {
        DriverFactory.killDriver();
    }
}
```

---

## 🔥 PageFactory (modelo avançado de POM)

```java
@FindBy(id = "user-name")
private WebElement username;

@FindBy(id = "password")
private WebElement password;

public void login(String user, String pass) {
    username.sendKeys(user);
    password.sendKeys(pass);
}
```

---

# 🟦 **6. Resumo Final**

| Conceito             | Para que serve                          |
| -------------------- | --------------------------------------- |
| **Classe**           | Representar tela, objeto ou utilitário  |
| **Método**           | Ação (clicar, preencher, navegar)       |
| **Função**           | Obter dados, retornar valores           |
| **Page Object**      | Deixar os testes limpos e profissionais |
| **Fluent Interface** | Encadeamento de chamadas                |
| **DriverFactory**    | Controlar instância do WebDriver        |
| **BaseTest**         | Evitar repetição de setup/teardown      |