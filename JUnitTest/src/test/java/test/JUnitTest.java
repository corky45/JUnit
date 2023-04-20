package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.JUnitElements;
import util.BrowserFactory;

public class JUnitTest extends BrowserFactory {
	WebDriver driver;

	@Before
	public void init() {
		driver = BrowserFactory.initDriver();
	}

	// Test 1: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.
	@Test
	public void validateToggleAll() {
		JUnitElements junitelements = PageFactory.initElements(driver, JUnitElements.class);
		junitelements.toggleAllButton();

	}

//Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected.
	@Test
	public void removeSingleListItem() {
		JUnitElements junitelements = PageFactory.initElements(driver, JUnitElements.class);
		junitelements.removeSingleListItem();
	}

//Test 3: Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
	@Test
	public void removeAllListItems() {
		JUnitElements junitelements = PageFactory.initElements(driver, JUnitElements.class);
		junitelements.removeAllListItems();
	}

	@After
	public void tear() {
		tearDown();
	}
}
