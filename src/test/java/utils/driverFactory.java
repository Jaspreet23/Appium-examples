package utils;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.io.File;

public class driverFactory {
	private AppiumDriver driver;
	
	@Before
    public void setUp() throws Exception {
		 File apk = new File("//Users/jazz/Desktop/Jazz/Eclipse Workspace/Appium-examples/src/test/java/android/");
	     File fs = new File(apk,"tradie.apk");
      
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("fullReset", "false");
        capabilities.setCapability("appium-version", "1.6.3");
        capabilities.setCapability("platformName", "android");
        //capabilities.setCapability("platformVersion", "(8.0.0)");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("app", fs.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.hip.tradie.android");
        capabilities.setCapability("appActivity", ".ui.MainActivity");
        
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }
	@After
	public void teardown(){
        //close the app
        driver.quit();
    }
}

