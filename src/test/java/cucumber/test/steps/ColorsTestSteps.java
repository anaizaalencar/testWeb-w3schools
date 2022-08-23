package cucumber.test.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ColorsTestSteps {
    private WebDriver navegador;
    @Dado("que Fulano tem acesso a pagina Color Groups")
    public void queFulanoTemAcessoAPaginaColorGroups() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ana.alencar\\IdeaProjects\\w3schoolsWebAutomacao\\drivers\\chromedriver.exe");
        this.navegador = new ChromeDriver();
        this.navegador.manage().window().maximize();
        this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        this.navegador.get("https://www.w3schools.com/colors/colors_groups.asp");
    }

    @Quando("ele visualizar o nome da cor {string} na coluna Color Name")
    public void eleVisualizarONomeDaCorNomeCorNaColunaColorName(String nomeCor) {
        Assertions.assertTrue(navegador.findElement(By.linkText(nomeCor)).isDisplayed());
    }

    @Então("ele deve visualizar o valor hexadecimal {string} na coluna HEX")
    public void eleDeveVisualizarOValorHexadecimalValorHexadecimalNaColunaHEX(String valorHexadecimal) {
        Assertions.assertTrue(navegador.findElement(By.linkText(valorHexadecimal)).isDisplayed());
        navegador.quit();
    }
}
