package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Test.SearchFunctionality;



public class Main {

	WebDriver driver;
	
	@BeforeTest
	
	public void setup() {
		
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	
	public void Test() {
		
		SearchFunctionality search = new SearchFunctionality(driver);
		
		search.placeHolder("Iphone 14");
		
		search.SearchButton();
		
		
		WebElement result = driver.findElement(By.className("a-color-state"));
		
		String resultText=result.getTagName();
		
		String ExpectedResult= "Iphone 14";
		
		if(resultText.contains(ExpectedResult)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
	
}
