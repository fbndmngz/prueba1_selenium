package Test_prueba;

//Test de coincidencia de titulos.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
    public static void main(String[] args) throws InterruptedException {

        String rutaDriver = "C:\\Users\\Fabiana Laree\\IdeaProjects\\Fabiana_Laree_Prueba1\\src\\test\\resources\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", rutaDriver);

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        System.out.println("El titulo de la pagina es: " + driver.getTitle());
        System.out.println("La url de la pagina es: " + driver.getCurrentUrl());

        driver.manage().window().maximize();


            // Se realiza una verificación simple, el título de la página sea el correcto.
            String pageTitle = driver.getTitle();
            assert pageTitle.contains("ToolsQA") : "El título de la página no coincide";


            Thread.sleep(10000); // 10000 milisegundos = 10 segundos
            driver.quit();

    }
}

