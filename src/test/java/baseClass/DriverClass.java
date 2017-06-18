package baseClass;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverClass  {

                

                public static WebDriver getDriver(String browser,String URL) throws IOException

                {               
                	 WebDriver driver=null;
                                switch (browser) {
                                case "FF":
                                                driver = new FirefoxDriver();
                                                driver.manage().deleteAllCookies();
                                                
                                                break;

                                case "IE":
                                                String IEpath = System.getProperty("user.home")
                                                                                + "\\gitworkspace\\Cucumber_Maven_Junit_Facebook_Project\\src\\test\\resources\\IEDriverServer.exe";
                                                System.setProperty("webdriver.ie.driver", IEpath);
                                                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                                                capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
                                                capabilities.setCapability("ignoreZoomSetting", true);
                                                capabilities.setCapability("ignoreProtectedModeSettings" , true);
                                                try {
                                                    Runtime.getRuntime().exec("RunDll32.exe InetCpl.cpl,ClearMyTracksByProcess 255");
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }
                                                driver = new InternetExplorerDriver(capabilities);
                                
                                                break;
                                case "CH":
                                                String chromepath = System.getProperty("user.home")
                                                                                + "\\gitworkspace\\Cucumber_Maven_Junit_Facebook_Project\\src\\test\\resources\\chromedriver.exe";
                                                
                                                System.setProperty("webdriver.chrome.driver", chromepath);
                                                                driver = new ChromeDriver();
                                                                driver.manage().deleteAllCookies();
                                
                                                break;
                                case "default":
                                                System.out.println("driver is not initialised ");
                                                break;
                                }
                                
                                driver.get(URL);
                                driver.manage().window().maximize();
                
                                return driver;
                }
                
                
}


