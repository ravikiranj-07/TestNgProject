 package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializedriver() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		//to read files
		prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		//for chrome
		if(browserName.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver();
		}
		//for firefox
		else if(browserName.equals("firefox")) {
			
		}
		else if(browserName.equals("IE")) {
			
		}
		else {
			System.out.println("you can choose anyone of above");
		}
		return driver;
		
		}
	@BeforeMethod
	public void launchBrowser() throws IOException {
		driver=initializedriver();
		driver.get(prop.getProperty("url"));
	}

}
