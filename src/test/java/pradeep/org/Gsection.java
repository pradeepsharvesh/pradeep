package pradeep.org;

import java.util.List;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Gsection {
	public static <webElement> void main(String[] args) throws InterruptedException{
	 System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\workspace\\JuneDemo\\New folder\\pradeep\\target\\sha\\msedgedriver.exe");
	 EdgeOptions opp = new EdgeOptions(); 
	 opp.addArguments("disable-notifications");
	 opp.addArguments("disable-popups");
	 opp.addArguments("start-maximized");
	 opp.addArguments("--headless");
	 WebDriver driver = new EdgeDriver();
	 String s ="https://www.redbus.in/";
	 driver.get(s);
	 System.out.println("pradeep");
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//	 driver.manage().window().maximize();
//	 WebElement drop = driver.findElement(By.xpath("//select[@id=\"first\"]"));
//	 Select a = new Select(drop);
//	 a.selectByIndex(1);
//	 Thread.sleep(3000);
//	 a.selectByValue("Yahoo");
//	 a.selectByVisibleText("Iphone");
//	 
//	List<WebElement> get =  a.getOptions();
//	for(int i=0;i<get.size();i--){
//		WebElement values = get.get(i);
//		String t = values.getText();
//		System.out.println(t);
//	}
	
//	}

//	private static void getOptions() {
		// TODO Auto-generated method stub
		
	}
}
