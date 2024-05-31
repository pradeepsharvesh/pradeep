package pradeep;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bsection {
	 public static void main(String[] args) throws InterruptedException, IOException{
		   System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\workspace\\JuneDemo\\New folder\\pradeep\\target\\sha\\msedgedriver.exe");
		   WebDriver driver=new EdgeDriver();
		   driver.navigate().to("https://careers.zohocorp.com/candidateportal?register=true");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//a[text()='Upload your resume']")).click();
		    Runtime.getRuntime().exec("\"C:\\Users\\HP\\Documents\"");
	 }
}