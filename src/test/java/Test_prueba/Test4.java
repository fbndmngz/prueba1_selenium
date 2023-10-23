package Test_prueba;

//Test de refrescar la pagina y validar  que datos sean borrados.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        String rutaDriver = "C:\\Users\\Fabiana Laree\\IdeaProjects\\Fabiana_Laree_Prueba1\\src\\test\\resources\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", rutaDriver);

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/webtables");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        var buttonAdd = driver.findElement(By.id("addNewRecordButton"));

        buttonAdd.click();

        Thread.sleep(3000);

        WebElement inputFirst = driver.findElement(By.id("firstName"));

        inputFirst.sendKeys("Fabiana");

        String textoEsperado1 = "Fabiana";
        assert inputFirst.equals(textoEsperado1) : "El texto ingresado no coincide con el texto esperado";

        Thread.sleep(3000);

        WebElement inputLast = driver.findElement(By.id("lastName"));

        inputLast.sendKeys("Laree");

        String textoEsperado2 = "Laree";
        assert inputFirst.equals(textoEsperado2) : "El texto ingresado no coincide con el texto esperado";

        Thread.sleep(3000);

        WebElement inputEmail = driver.findElement(By.id("userEmail"));

        inputEmail.sendKeys("fabi.laree@gmail.com");

        Thread.sleep(3000);

        WebElement inputAge = driver.findElement(By.id("age"));

        inputAge.sendKeys("23");

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(5000); // 10000 milisegundos = 10 segundos

        buttonAdd = driver.findElement(By.id("addNewRecordButton"));

        buttonAdd.click();

        String Resultado= "Vacio";
        assert buttonAdd.equals(Resultado) : "Los campos deben estar vacios";

        Thread.sleep(3000);

        driver.quit();

    }
}
