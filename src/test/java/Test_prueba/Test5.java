package Test_prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
    private static Object Assert;

    public static void main(String[] args) throws InterruptedException {
        String rutaDriver = "C:\\Users\\Fabiana Laree\\IdeaProjects\\Fabiana_Laree_Prueba1\\src\\test\\resources\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", rutaDriver);

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        driver.navigate().to("https://demoqa.com/automation-practice-form");

        Thread.sleep(5000);
        driver.findElement(By.id("firstName")).sendKeys("Fabiana");

        Thread.sleep(2000);

        driver.findElement(By.id("lastName")).sendKeys("Laree");

        Thread.sleep(2000);

        driver.findElement(By.id("gender-radio-1")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("exp-3")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("dateOfBirthInput")).sendKeys("01 Jul 1990");
        Thread.sleep(2000);

        driver.findElement(By.id("profession-1")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("tool-2")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("tool-3")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("tool-4")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("uploadPicture")).sendKeys("ruta/al/archivo.png");

        Thread.sleep(2000);

        driver.findElement(By.id("userEmail")).sendKeys("fabi.laree@gmail.com");

        // Ingresa el número de teléfono
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");

        // Ingresa la dirección actual
        driver.findElement(By.id("currentAddress")).sendKeys("Hola");

        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("state")).sendKeys("NCR");
        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("Delhi");
        driver.findElement(By.id("city")).click();

        driver.findElement(By.id("submit")).click();

        WebElement confirmation = driver.findElement(By.id("example-modal-sizes-title-lg"));
        Assert.equals("Formulario enviado");

        // Cierra el navegador
        driver.quit();
    }

    }
