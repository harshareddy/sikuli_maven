package sikuli_classfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Test1 {
	
  @Test
  public void fileUpload() throws InterruptedException, FindFailed {
	// Launch the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Intellipat_March 22\\chromedriver.exe");
			
		// Create a driver object
		WebDriver driver = new ChromeDriver();
			
		//Navigate to the test URL
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get");		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		// Using Sikuli to navigate and upload the file
		// Screen() is a Sikuli class similar to Java Robot
		Screen s = new Screen();
		Thread.sleep(5000);
		
		//s.click("C:\\Intellipat_March 22\\sikuli_maven\\src\\Sikuli_locators\\choosefile.PNG");
		s.click("C:\\Intellipat_March 22\\choosefile.PNG");
		Thread.sleep(7000);
		Pattern filepath = new Pattern("C:\\Intellipat_March 22\\sikuli_maven\\src\\Sikuli_locators\\File Name.PNG");
		Pattern open_button = new Pattern("C:\\Intellipat_March 22\\sikuli_maven\\src\\Sikuli_locators\\open.PNG");
		
		// To send data to text box use type method.. type is similar to sendKeys()
		s.type(filepath, "C:\\Intellipat_March 22\\sikuli_maven\\src\\Sikuli_locators\\Adya's word powerpoint of stories..pptx");
		Thread.sleep(5000);
		s.click(open_button);
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
	  
  }
}
