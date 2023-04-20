package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JUnitElements{
	WebDriver driver;
	
	public JUnitElements(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library
	@FindBy (how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement ToggleAllButton;
	@FindBy (how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[1]/input")
	WebElement SingleCheckbox;
	@FindBy (how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement RemoveButton;

	public void toggleAllButton() {
		ToggleAllButton.click();
	}
	//Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected.

	public void removeSingleListItem() {
		SingleCheckbox.click();
		RemoveButton.click();
	}
	//Test 3: Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
	public void removeAllListItems() {
		ToggleAllButton.click();
		RemoveButton.click();
	}
}