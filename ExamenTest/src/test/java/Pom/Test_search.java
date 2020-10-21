package Pom;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Test_search {

	private WebDriver driver;
	Home home;
	Resultado resultado;
	
	
	@Before
	public void setUp() {
		home = new Home (driver);
		driver = home.chromeConnection();
		home.open("https://www.fravega.com");
		
	}


	@Test
	public void test() {
		home.search("Heladera");
		resultado = new Resultado (driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		resultado.filterByProduct();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		resultado.filterByBrand();

		
		
            
		
		
	}

}
