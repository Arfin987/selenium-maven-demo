package day34;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

    @Test
    public void verifyGoogleTitle() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();

        System.out.println("Title: " + title);

        Assert.assertTrue(title.contains("Google"));

        driver.quit();
    }
}