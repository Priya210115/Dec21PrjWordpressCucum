package org.example.stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LogInSteps {

    WebDriver driver;

    @Given("User is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @When("User enters (.*) and (.*)$")
    public void user_enters_user_name_and_password(String uname,String pswd) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);

    }

    @And("User clicks on Login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();
    }

    @Then("User should land on Home Page")
    public void user_should_land_on_home_page() {
        System.out.println("Logged in successfully");
    }


}
