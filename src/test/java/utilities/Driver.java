package utilities;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.opera.*;
import org.openqa.selenium.safari.*;

public class Driver {

//If you don't want an object to be created from this class you can make constructor private (Singleton class)
    private Driver(){}

    //Create WebDriver as static so it can be created in the memory as soon as program begins
    static WebDriver driver;

    //By calling the following getDriver method, you can access the Driver object that has been created in the memory as
    // a first thin as it's static. You don't need to create a WebDriver object. Driver.getDriver

    public static WebDriver getDriver(){
        if (driver == null) {

            //The following line is to access the browser value of ConfigurationReader class. It will return the browser
            // which is chrome. ConfigurationReader is used to get the information in the configuration.properties class.
            String browser = ConfigurationReader.getProperty("browser");
            String engineer = ConfigurationReader. getProperty("engineer");

            switch(browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
            }

        }
        return driver;
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();//Close driver
            driver = null;//Delete driver from memory
        }
    }
}