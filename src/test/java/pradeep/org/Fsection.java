package pradeep.org;

import java.time.Duration;
import java.util.List;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fsection {
	public static <webElement> void main(String[] args) throws InterruptedException{
		 System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\workspace\\JuneDemo\\New folder\\pradeep\\target\\sha\\msedgedriver.exe");
		 WebDriver driver = new EdgeDriver();
		 driver.get("https://demo.guru99.com/test/web-table-element.php");
		 driver.manage().window().maximize();
	     List<WebElement> table = driver.findElements(By.tagName("table"));
		for(int i=0;i<table.size();i++){
			WebElement T = table.get(i);
			WebElement tbody = T.findElement(By.tagName("tbody"));
			 List<WebElement> trows = tbody.findElements(By.tagName("tr"));
			 for(int j=0;j<trows.size();j++){
				 WebElement tr = trows.get(j);
				 String text = tr.getText();
				 System.out.println(text);
//				 String td = "apollo hospital";
				// System.out.println(text);
				
			//	driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[10]"));
			//	WebElement a = tr.findElement(By.tagName("td"));
//				 for(int k=0;k<tda.size();k++){
//					 WebElement td = tda.get(k);
//					 String textA = td.getText();
					// System.out.println(textA);
					if(text.equals("IDFC Bank")){
						 System.out.println("IDFC"+table.get(i).getText());
						 
					}

				 
				 
						
				 
			 }
		}

		
		
	}
}


