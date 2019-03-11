package in.ankitpati.newmoon;

import org.openqa.selenium.*;

public class App {
    public static void main(String[] args) throws Exception {
        //String driverPath = App.class.getClassLoader().getResource("geckodriver").toString(); // for Firefox
        String driverPath = App.class.getClassLoader().getResource("chromedriver").toString(); // for Chrome

        //WebDriver driver = (WebDriver) Class.forName("org.openqa.selenium.firefox.FirefoxDriver").getConstructor().newInstance(); // for Firefox
        WebDriver driver = (WebDriver) Class.forName("org.openqa.selenium.chrome.ChromeDriver").getConstructor().newInstance(); // for Chrome

        driver.get("https://ankitpati.in/ssh-deployer");

        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("ankitpati");
        driver.findElement(By.id("password")).sendKeys("iltc");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type='reset']")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
