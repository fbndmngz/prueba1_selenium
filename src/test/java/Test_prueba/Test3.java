package Test_prueba;

//test para borrar datos recientemente ingresados.

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
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

        String valorActual1 = inputFirst.getAttribute("value");

        String textoEsperado1 = inputFirst.getAttribute("Fabiana");

        Assert.assertEquals(textoEsperado1, valorActual1);

        Thread.sleep(3000);

        WebElement inputLast = driver.findElement(By.id("lastName"));

        inputLast.sendKeys("Dominguez");

        String valorActual2 = inputLast.getAttribute("value");

        String textoEsperado2 = inputLast.getAttribute("Laree");

        Assert.assertEquals(textoEsperado2, valorActual2);

        Thread.sleep(3000);

        WebElement inputEmail = driver.findElement(By.id("userEmail"));

        inputEmail.sendKeys("fabi.laree@gmail.com");

        Thread.sleep(3000);

        WebElement inputAge = driver.findElement(By.id("age"));

        inputAge.sendKeys("23");

        Thread.sleep(3000);

        WebElement inputSalary = driver.findElement(By.id("salary"));

        inputSalary.sendKeys("123456");

        Thread.sleep(3000);

        WebElement inputDepartment = driver.findElement(By.id("department"));

        inputDepartment.sendKeys("QA");

        Thread.sleep(3000);

        var buttonSubmit= driver.findElement(By.id("submit"));

        buttonSubmit.click();
        assert buttonSubmit.equals(buttonSubmit) : "Datos no ingresados";

        Thread.sleep(5000);

        WebElement delete = driver.findElement(By.className(""));

        // Hacer clic en el elemento
        delete.click();

        Thread.sleep(10000); // 10000 milisegundos = 10 segundos
        driver.quit();
    }
}
