package Shabbeer;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	 driver.findElement(By.id("email")).sendKeys("9490151542");
	 driver.findElement(By.name("pass")).sendKeys("jana.900");
	 driver.findElement(By.name("login")).submit();
	 
	
		
		
		
	}
	
}