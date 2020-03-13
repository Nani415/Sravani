package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver dr;
  @Test
  public void f() throws InterruptedException {
	  WebDriver dr=new ChromeDriver();
	  dr.get("https://ebay.com");
	  dr.manage().window().maximize();
	  dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  dr.findElement(By.linkText("register")).click();
	  Thread.sleep(5000);
	  dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys("hemanth");
	  dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys("goda");
	  dr.findElement(By.xpath("//input[@name='email']")).sendKeys("hemanthnani.goda@gmail.com");
	  dr.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("kinshu@123");
	  Thread.sleep(2000);
	  dr.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
  @Test(dependsOnMethods="f")
  public void reg() throws InterruptedException{
	  dr.navigate().to("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
	  
  }
}
