package abc_practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFoooterLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/saied rahman/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // For Chrome Browser 
		driver.get("https://www.google.com");
	}

}
