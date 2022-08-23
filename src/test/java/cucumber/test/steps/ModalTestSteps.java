package cucumber.test.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ModalTestSteps {
    private WebDriver navegador;
    @Dado("que Fulano tem acesso a pagina ModalBoxes")
    public void queFulanoTemAcessoAPaginaModalBoxes() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ana.alencar\\IdeaProjects\\w3schoolsWebAutomacao\\drivers\\chromedriver.exe");
        this.navegador = new ChromeDriver();
        this.navegador.manage().window().maximize();
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        this.navegador.get("https://www.w3schools.com/howto/howto_css_modals.asp");
    }

    @Quando("ele clica no botao Abrir Modal")
    public void eleClicaNoBotaoAbrirModal() {
        navegador.findElement(By.cssSelector("button[class='ws-btn w3-dark-grey']")).click();
    }

    @Então("ele deve visualizar o modal em tela")
    public void eleDeveVisualizarOModalEmTela() {
        navegador.findElement(By.cssSelector("header[class='w3-container w3-red w3-display-container']")).isDisplayed();
    }

    @Quando("ele clica no botao de fechar no canto superior a direita do modal")
    public void eleClicaNoBotaoDeFecharNoCantoSuperiorADireitaDoModal() {
        navegador.findElement(By.cssSelector("span[class='w3-button w3-xlarge w3-display-topright w3-hover-red w3-hover-opacity']")).click();
    }

    @Então("ele deve nao mais visualizar o modal em tela")
    public void eleDeveNaoMaisVisualizarOModalEmTela() {
        WebElement modal = navegador.findElement(By.cssSelector("header[class='w3-container w3-red w3-display-container']"));
        Assertions.assertFalse(modal.isDisplayed());
        navegador.quit();
    }
}
