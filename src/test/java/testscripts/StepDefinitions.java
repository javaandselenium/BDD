package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	public WebDriver driver;
	@Given("user open the browsers and enters the valid url")
	public void user_open_the_browsers_and_enters_the_valid_url() {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("user enters vaid username and password")
	public void user_enters_vaid_username_and_password() {

driver.findElement(By.id("email")).sendKeys("admin");
driver.findElement(By.id("pass")).sendKeys("manager");
	}

	@When("click on login button")
	public void click_on_login_button() {
driver.findElement(By.name("login")).click();

	}

	@Then("user should be scussfully login into aplication and hompage should be dispalyed")
	public void user_should_be_scussfully_login_into_aplication_and_hompage_should_be_dispalyed() {

		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Facebook – log in or sign up")) {
			System.out.println("Pass:home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}
		
		driver.close();
	}


}
