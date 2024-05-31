package pradeep.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Esection {
	public static void main(String[] args){
	 System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\workspace\\JuneDemo\\New folder\\pradeep\\target\\sha\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 driver.get("https://www.facebook.com/login.php/");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	 
	 
	 
	 
	}
}
