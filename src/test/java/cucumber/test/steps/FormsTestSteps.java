package cucumber.test.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class FormsTestSteps {

    private WebDriver navegador;
    @Dado("que Fulano tem acesso a pagina HTML Forms")
    public void queFulanoTemAcessoAPaginaHTMLForms() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ana.alencar\\IdeaProjects\\w3schoolsWebAutomacao\\drivers\\chromedriver.exe");
        this.navegador = new ChromeDriver();
        this.navegador.manage().window().maximize();
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        this.navegador.get("https://www.w3schools.com/html/html_forms.asp");
    }

    @E("ele clica no botao Tente voce mesmo")
    public void eleClicaNoBotaoTenteVoceMesmo() {
        navegador.findElement(By.cssSelector("a[class='w3-btn w3-margin-top w3-margin-bottom']")).click();
    }

    @E("ele preencher o campo First name com seu {string}")
    public void elePreencherOCampoFirstNameComSeuNome(String nome) {
        navegador.findElement(By.id("fname")).clear();
        navegador.findElement(By.id("fname")).sendKeys(nome);
    }

    @E("ele preencher o campo Last name com seu {string}")
    public void elePreencherOCampoLastNameComSeuSobrenome(String sobrenome) {
        navegador.findElement(By.id("lname")).clear();
        navegador.findElement(By.id("lname")).sendKeys(sobrenome);
    }

    @Quando("ele clicar no botao Submit")
    public void eleClicarNoBotaoSubmit() {
        navegador.findElement(By.cssSelector("input[value='Submit']")).click();
    }

    @Então("ele visualiza que a entrada recebida pelo formulario enviado foi texto")
    public void eleVisualizaQueAEntradaRecebidaPeloFormularioEnviadoFoiTexto() {
        Assertions.assertTrue(navegador.findElement(By.cssSelector("div[class = 'w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']")).isDisplayed());
        navegador.quit();
    }
}
