package android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

public class basics {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("XXXXXXXXXX")
                .setAutomationName("UIAutomator2")
                .setPlatformName("Android")
                .withBrowserName("Chrome");

        options.setChromedriverExecutable("/Users/aashok/IdeaProjects/appium_/drivers/chromedriver");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("hello");
        Thread.sleep(2000);
        driver.quit();
    }
}
