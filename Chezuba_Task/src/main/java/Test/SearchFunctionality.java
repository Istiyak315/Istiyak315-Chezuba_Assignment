package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFunctionality {

	WebDriver driver;
	
	public SearchFunctionality(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By SearchBar=By.id("twotabsearchtextbox");
	
	By SearchIcon=By.id("nav-search-submit-button");
	
	
	
	public void placeHolder(String input) {
		
		driver.findElement(SearchBar).sendKeys(input);
		
	}
	
	public void SearchButton() {
		
		driver.findElement(SearchIcon).click();
	}
}
