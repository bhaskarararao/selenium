package com.capgemini.myfirstseleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Softwares\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bgunukul\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		///html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.get("http://www.google.com");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//*[@id="tsf"]/div[2]/div[1]/div[2]/div/div[2]/input
		//*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input
		//WebElement search = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		//search.sendKeys("Capgemini");
		//search.submit();
//		String title = driver.getTitle();
//		System.out.println(title);
//		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//https://mail.rediff.com/cgi-bin/login.cgi
			
			//driver.findElement(By.xpath("//input[@name='q']")).click();
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		    //driver.quit();
		
			//input[@type='text'][@name='txtUsername']
			//a[contains(text(),'Forgot')]
			//div[text()='LOGIN Panel']

			 

			//input[starts-with(@name,'txtUser')]
			//input[starts-with(@name,'txtU') or @id='txtUsername']
			//input[starts-with(@name,'txtU') and @id='txtUsername']
			
			/*List<WebElement>list=driver.findElements(By.tagName("a"));
	        Iterator<WebElement> i=list.iterator();
	        while(i.hasNext())
	        {
	            System.out.println(i.next().getText());
	        }*/
		
				
	/*	WebElement images = driver.findElement(By.linkText("Images"));
		images.click();*/
		//driver.quit();

	}

}
