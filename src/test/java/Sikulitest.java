import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.remote.RemoteWebDriver;
 
 
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Sikulitest 
{

	public static void main(String[] args) throws Exception 
	{
        WebDriverManager.chromedriver().setup();
         
         RemoteWebDriver driver = new ChromeDriver();

		driver.get("https://www.magnitia.com/images/courses/Selenium-with-Java-Magnitia-Content.pdf");
		 //driver.get("https://selectorshub.com/xpath-practice-page"); 
         driver.manage().window().maximize();
	 		Thread.sleep(15000);
	 		//WebElement e = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
	  		//driver.executeScript("arguments[0].scrollIntoView();",e);
	  		//Thread.sleep(5000);
	  		
		Screen s1 = new Screen();
		s1.click("C:\\Users\\PAVAN\\Desktop\\Desktop\\download.png");
		//s1.click("C:\\Users\\PAVAN\\Desktop\\Desktop\\LearningHub.PNG");
		Thread.sleep(5000); 
		//Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);

	 

		





	}

}
