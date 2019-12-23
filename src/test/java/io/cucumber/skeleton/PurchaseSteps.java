package io.cucumber.skeleton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


public class PurchaseSteps {

	WebDriver driver;
	
	@Given("^I have a list of products$")
	public void user_app_home_page(){
			
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\io\\cucumber\\skeleton\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.americanas.com.br/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	}
	
	@When("^I search one \"(.*)\"$")
	public void user_clicks_on_Search(String product) {
	    driver.findElement(By.className("src-input")).sendKeys(product);
	    driver.findElement(By.className("src-input")).sendKeys(Keys.ENTER);
	}
	
	@And("^I click to search")
	public void user_clicks_on_Buynow() {
		
		for (WebElement option : driver.findElements(By.xpath("//*[contains(text(),'Console')]"))) {
	        if (option.getText().toLowerCase().contains("console")) {
	            option.click();
	            return;
	        }
		
					
		}

	}
	
	@Then("^user enters \"(.*)\"$")
	public void user_enters_cep(String cep) {
	  driver.findElement(By.xpath("//*[@id=\"freight-field\"]")).sendKeys(cep);
	  driver.findElement(By.xpath("//*[@id=\"freight-field\"]")).sendKeys(Keys.ENTER);
	  
	List<WebElement>console= driver.findElements(By.xpath("//*[@id=\"content\"]/div/div/div[2]/div/section/div/div[2]/div[2]/div/div[2]/div/div[2]"));
	System.out.println("Number of web elements: " +console.size());
	
	for  (WebElement consolelnk : console) {
	consolelnk.click();
	String srtLinkTest = consolelnk.getText();
	 System.out.println(srtLinkTest);
		
	}
	}
	
	
	@And("^I click to submit$")
	public void user_clicks_on_submit() {
	    WebElement submit = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/section/div/div[2]/div[2]/div/div[3]/div/div[1]/div[1]/div/a/div/span"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", submit);
	    
	    WebElement garantia12 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/main/div[2]/div/div/div[1]/section[1]/div/div[2]/div/div[2]/div/div[2]/div/header/label/span/span"));
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].click();", garantia12);
	    
	    WebElement garantia1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/main/div[2]/div/div/div[1]/section[2]/div/div[2]/div/div[2]/div/div[2]/div/header/label/span/span/span"));
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("arguments[0].click();", garantia1);
	}
	
	@Then("^Check the basket$")
	public void close_the_Browser(){
		WebElement continuar = driver.findElement(By.xpath("/html/body/div[4]/div/div/main/div[2]/div/div/div[2]/section/div[3]/div[1]/div/button/div/span"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", continuar);
	    
	    List<WebElement>console= driver.findElements(By.xpath("/html/body/div[4]/section"));
		System.out.println("Number of web elements: " +console.size());
		
		for  (WebElement consolelnk : console) {
		consolelnk.click();
		String srtLinkTest = consolelnk.getText();
		 System.out.println(srtLinkTest);
	    
	    
	   // driver.close();
		}
	}
	
}
