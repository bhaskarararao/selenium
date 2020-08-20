package com.capgemini.myfirstseleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bgunukul\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();;
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9703747755");
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
		 driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("April@1234");
		 driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		 WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 ele.sendKeys("MI tv");
		 ele.submit();
		 WebElement link1 = driver.findElement(By.xpath("(//a[contains(.,'Mi TV 4A PRO 80 cm (32 inches) HD Ready Android LED TV (Black) | With Data Saver')])[1]"));
		 link1.click();
		 String firstWndName = driver.getWindowHandle();
		 for(String handlename:driver.getWindowHandles()) {
		        if(!handlename.equals(firstWndName)){
		            driver.switchTo().window(handlename);
		            Thread.sleep(1000);
		            WebElement addtocart = driver.findElement(By.xpath("//input[contains(@value,'Add to Cart')]"));
		            addtocart.click();
		        }
		    }
	}

}
