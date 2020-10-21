package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Resultado extends Base{
	
	
	By filterHeladeras = By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[1]/ul/li[2]/ul/li[1]/ul/li[2]/a/h4");
	By samsung = By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[1]/ul/li[2]/ul/li[3]/ul/li[6]/a/label");


	public Resultado(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
    public void filterByProduct() {
        click(filterHeladeras);
    }
    
    public void filterByBrand() {
        click(samsung);	
    }
    
    public void listarElementos
    
    }