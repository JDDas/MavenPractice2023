package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestOne {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.delta.com/");
        // System.out.println(driver.getTitle());
        //  driver.navigate().to("https://www.facebook.com");
        // System.out.println(driver.getTitle());
        // driver.navigate().back();
        //  driver.navigate().forward();
        //  driver.get("https://actitime.com");
        driver.findElements(By.cssSelector("a"));
        List<WebElement> links = driver.findElements(By.cssSelector("a"));
        for (WebElement link : links) {
            System.out.println(link.getText());
            // driver.quit();


        }
    }
}