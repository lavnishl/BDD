package baseClass;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;


public class BaseTest {

protected  WebDriver driver=null;
public Properties OR = new Properties();

             
                public void setup() throws IOException {
                                
                                
                                FileInputStream fis = new FileInputStream(
                                System.getProperty("user.dir")+ "\\src\\test\\resources\\OR.properties");
                                OR.load(fis);
                                
                                                }

                                
                public void init() throws IOException {
                                String browsertype = OR.getProperty("browsertype");
                                String url = OR.getProperty("URL");
                                driver = DriverClass.getDriver(browsertype, url);
                }

                
                
                public void tearDown() {
                                driver.quit();

                }
                
             
            	
}
