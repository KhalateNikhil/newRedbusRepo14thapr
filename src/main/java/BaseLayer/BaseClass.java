package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static WebDriver driver;
	protected static Properties prop;
	
	
	public BaseClass()
	{
		File f= new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigurtionLayer\\redbus.properties");
	
		try {
			FileInputStream fis= new FileInputStream(f);
			
			 prop= new Properties();
			 prop.load(fis);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public static void initialization()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\AllDriversFolder\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.manage().deleteAllCookies();
		 String url=prop.getProperty("URL");
		 driver.get(url);
		 System.out.println("LoginPage TC created by NikhilTester");
		 
	}
	
	
	
	
	
	
	
}



