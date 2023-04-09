package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitTest {
	WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\clcra\\eclipse-workspace\\JUnitTest\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://techfios.com/test/107/");
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

//Test 1: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.
	@Test
	public void validateToggleAll() {
		driver.findElement(By.cssSelector("input[name=\"allbox\" i]")).click();
	}

//Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected.
@Test
	public void removeSingleButton(){
	driver.findElement(By.cssSelector("input[name=\"todo[3]\"]")).click();
	driver.findElement(By.cssSelector("input[value=\"Remove\"]")).click();
	}
//Test 3: Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
	@Test
	public void removeAllListItems() {
		validateToggleAll();
		driver.findElement(By.cssSelector("input[value=\"Remove\"]")).click();
	}
@After
public void tearDown() {
	driver.close();
	driver.quit();
}
}

