package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SignTest {
    @Test
    public void testTitleHome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucas\\Documents\\drives\\chromedriver.exe"); // caminho do webDriver
        WebDriver navegador = new ChromeDriver(); // iniciando navegador

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // aguardadndo 5 segundos para fazer os camandos do navegador

        navegador.get("https://github.com/"); // entra no site  do github

        navegador.findElement((By.linkText("Sign in"))).click(); // Apertando no botao login

        navegador.findElement(By.name("login")).sendKeys("lucass601@gmail.com"); // inserindo email
        navegador.findElement(By.name("password")).sendKeys("Teste235"); // inserindo senha

        navegador.findElement((By.name("commit"))).click(); // Fazer login no github

        String titulo = navegador.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div/main/div[1]/h1")).getText();
        //pegando valor do titulo da pagina.

        assertEquals("The home for all developers — including you.", titulo); // fazendo a comparacao.
    }

    @Test
    public void testeTitleRepository() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucas\\Documents\\drives\\chromedriver.exe"); // caminho do webDriver
        WebDriver navegador = new ChromeDriver(); // iniciando navegador

        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // aguardadndo 5 segundos para fazer os camandos do navegador

        navegador.get("https://github.com/"); // entra no site  do github

        navegador.findElement((By.linkText("Sign in"))).click(); // Apertando no botao login

        navegador.findElement(By.name("login")).sendKeys("lucass601@gmail.com"); // inserindo email
        navegador.findElement(By.name("password")).sendKeys("Teste235"); // inserindo senha

        navegador.findElement((By.name("commit"))).click(); // Fazer login no github

        navegador.findElement((By.linkText("lucassantos235/teste"))).click();

        String tituloRepositorio = navegador.findElement(By.xpath("/html/body/div[5]/div/main/div[2]/div/div/div[3]/div[1]/div[4]/div[2]/article/h1")).getText();

        assertEquals("teste", tituloRepositorio);
    }
}
