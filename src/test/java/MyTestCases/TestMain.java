package MyTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMain {
	
	@Test
	public void testHelloworld() {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Drivers\\chromedriver_win32\\C-90\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    String driverPath = "";
	     driver.get("https://www.google.com");
		System.out.println("test1");
	}

	@Test
	public void testHelloworld1() {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Drivers\\chromedriver_win32\\C-90\\chromedriver.exe");  
	    WebDriver driver1=new ChromeDriver();
	    driver1.get("https://www.facebook.com");
		System.out.println("test2");	}


}
