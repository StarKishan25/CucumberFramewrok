package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_is_already_on_login_page(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@When("^Title of the login page$")
	public void title_of_the_login_page() {
		String title = driver.getTitle();
		System.out.println("Page title:"+title);
		Assert.assertEquals("Facebook – log in or sign up", title);
		System.out.println("Title matched");
	}

//	Regular expressions
//	1. \"(.*)\"
//	2. \"([^\"]*)\"
	
	@Then("^User enters the \"(.*)\" & \"(.*)\"$")
	public void user_enters_the_id_password(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
	}

	@Then("^User clicks the login button$")
	public void user_clicks_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("^User enters the homepage$")
	public void user_enters_the_homepage() {
		String title = driver.getTitle();
		System.out.println("Home page tite: "+title);
	}

	@Then("^close the browser$")
	public void close_the_browser()  {
		driver.close();
	    
	}
}
