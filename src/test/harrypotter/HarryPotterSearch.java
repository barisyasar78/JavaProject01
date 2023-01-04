package test.harrypotter;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class HarryPotterSearch extends BaseClass {
	
	// go to amazon.com
	// select books from the search dropdown
	// type harry potter
	// and click on search
	// check "kindle unlimited eligible" checkbox on the left
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(3000);
		
		WebElement searchDDElement = driver.findElement(By.id("searchDropdownBox"));
		
		Select selectDD = new Select(searchDDElement);
		
	    	List<WebElement> optionList = selectDD.getOptions();
		
		for (WebElement option : optionList) {
			System.out.println(option.getText());
		}
		
		
		
		tearDown();
		
	}
	
}