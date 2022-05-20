import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {

    @Test
    public void pesquisarGoogle() {
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();

        navegar.get("https://google.com.br");
        navegar.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).click();
        navegar.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Desenvolvimento web", Keys.ENTER);
        navegar.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div[1]/div/a/h3")).click();

    }
}
