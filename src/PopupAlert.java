import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PopupAlert {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com");
		driver.findElement(By.xpath("//input[@id='button-login']")).click();
		
		
		

	}

}
