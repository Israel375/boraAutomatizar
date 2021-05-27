package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {
	
	// criar um objeto chamado driver do tipo WebDriver
	WebDriver driver; 

	@Before
	public void setUp() throws Exception {
		
		// setup do navegador
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		// abrir o navegador
		driver = new ChromeDriver();
			
		// acessar o site desejado através do metodo get();
		// driver.get("https://www.bradesco.com.br");
		
		// como maximizar o browser usando selenium
		driver.manage().window().maximize();
		
		// como fechar o navegador
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void validarSite() {
		driver.get("https://www.bradesco.com.br");
		String titulo = driver.getTitle();
		assertEquals("Banco Bradesco | Desafie o Futuro", titulo);
		driver.quit();	
		
	}
	
	@Test
	public void pesquisarEscola() {
		
		driver.get("https://www.google.com.br");
		driver.findElement(By.name("q")).sendKeys("E2E Treinamentos");
		driver.findElement(By.name("q")).submit();
	}

}
