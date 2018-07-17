package p1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class {
@Test
public void newtest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b8c.07.19\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://github.com/login");
driver.findElement(By.id("login_field")).sendKeys("sourishpal");
driver.findElement(By.id("password")).sendKeys("S@urish123");
driver.findElement(By.name("commit")).click();
String title=driver.getTitle();
System.out.println(title);
Assert.assertEquals(title,"Sign in to GitHub · GitHub");
System.out.println("continue....");
System.out.println("continue....");

}
}
