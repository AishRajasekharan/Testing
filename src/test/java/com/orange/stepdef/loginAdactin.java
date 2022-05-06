package com.orange.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAdactin {
    WebDriver driver;

    @Given("launch the browser")
    public void launch_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
    @Given("open the application")
    public void open_the_application() {
driver.get("https://adactinhotelapp.com/");
    }
    @When("enter the username and password")
    public void enter_the_username_and_password() {
        WebElement user= driver.findElement(By.id("username"));
        user.sendKeys("admin");
        WebElement pass=driver.findElement(By.id("password"));
        pass.sendKeys("1231");


    }
    @When("click the login button")
    public void click_the_login_button() {
        WebElement login=driver.findElement(By.id("login"));
        login.click();

    }
    @Then("Validate the outcomes")
    public void validate_the_outcomes() {
        WebElement msg = driver.findElement(By.xpath("a[text()='Invalid Login details or Your Password ']"));
        String text= msg.getText();
        Assert.assertEquals(text, "to reset your password");

    }
    @Then("close the browser")
    public void close_the_browser() {

    }


}
