package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;

public class Test {
    public static void main(String [] arg) {
        //Website URL
        String loginUrl = "https://katalon-demo-cura.herokuapp.com/";

        //username password and Id
        String usernameFieldId = "John Doe";
        String passwordFieldId= "ThisIsNotAPassword";
        String loginButtonId= "";

        //Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chira\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();

        //Open Login Page
        driver.get(loginUrl);

        //Click Make appointment
        WebElement appointment_button = driver.findElement(By.id("btn-make-appointment"));

        //Find Username and password fields
        WebElement usernameField = driver.findElement(By.id("txt-username"));
        WebElement passwordField = driver.findElement(By.id("txt-password"));

        //Find Login Button and click
        WebElement login_button = driver.findElement(By.id("btn-login"));



        //








    }
}
