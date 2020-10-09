package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginCCB 
{
 
public static void main(String[] args) throws InterruptedException 
{
 
System.setProperty("webdriver.gecko.driver", "C:\\OUTATEST\\runtime_backup\\driver\\abc\\geckodriver.exe");
 
// Initialize browser
WebDriver driver=new FirefoxDriver();

 
// Open facebook
driver.get("https://lv01085.build.corp.oncor.com:7601/serverDEV8/loginPage.jsp");
driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@type='text'][@name='j_username']")).sendKeys("U6HT");
driver.findElement(By.xpath("//input[@type='password'][@name='j_password']")).sendKeys("Welcome@2020");
driver.findElement(By.id("loginButton")).click();
System.out.println("Hello World");
Thread.sleep(30000);
System.out.println("First Sleep");
driver.findElement(By.xpath("//span[@role='button'  and  @id='youAreLoggedInAsSpan']")).click();
Thread.sleep(30000);
driver.findElement(By.xpath("//span[text()='Logout']")).click();
Thread.sleep(30000);
System.out.println("Logout Successfully");
 
// Maximize browser
 

Thread.sleep(1000);
driver.close();
 
}
 
}


