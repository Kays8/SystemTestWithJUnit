import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class TestCustomerForm {

	@Disabled
	void test01() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.coding-midcareer.com/register");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)", "");
        
        Boolean dep_tel_tf =driver.findElement(By.name("dep_tel")).isEnabled();
        assertTrue(dep_tel_tf);
        
        Boolean receipt_name_tf =driver.findElement(By.name("receipt_name")).isEnabled();
        assertFalse(receipt_name_tf);
        
//        WebElement firstNameInput = driver.findElement(By.id("firstname"));
//        WebElement lastNameInput = driver.findElement(By.id("lastname"));
//        WebElement ageInput = driver.findElement(By.id("age"));
//        WebElement submitButton = driver.findElement(By.id("sub"));
//        firstNameInput.sendKeys("johnjohn");
//        lastNameInput.sendKeys("canonc");
//        ageInput.sendKeys("2");
//        
//        submitButton.click();
//        
//        String result = driver.findElement(By.id("firstname")).getText();
//        assertEquals("johnjohn", result);
//        driver.close();
	}
	
		@Test
		void testButton() throws InterruptedException {
			WebDriver driver = null;
			System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://mflowthai.com/mflow/consent");
        
        	Boolean confirm_btn1 =driver.findElement(By.id("confirmModalButton")).isEnabled();
        	assertFalse(confirm_btn1);
        	
//        	Click Check_box
        	WebElement chk0 = driver.findElement(By.id("0"));
        	WebElement chk1 = driver.findElement(By.id("1"));
        	WebElement chk2 = driver.findElement(By.id("2"));
        	WebElement chk3 = driver.findElement(By.id("3"));
        	chk0.click();
        	chk1.click();
        	chk2.click();
        	chk3.click();
        	
        	JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)", "");
             
            Boolean dep_tel2_tf =driver.findElement(By.id("confirmModalButton")).isEnabled();
        	assertTrue(dep_tel2_tf);
        	driver.findElement(By.id("confirmModalButton")).click();
        	
        	Thread.sleep(3000);
        	Boolean confirm_btn3 =driver.findElement(By.id("confirmModalButton")).isEnabled();
        	assertFalse(confirm_btn3);
	}
}
	