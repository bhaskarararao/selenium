package com.capgemini.myfirstseleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Test{
public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\bgunukul\\Downloads\\chromedriver.exe");
   
    ChromeDriver driver = new ChromeDriver();
           
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)    ;
   
    driver.manage().window().maximize();
   
    driver.get("https://www.amazon.in/");
   
    WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
    searchbox.sendKeys("samsung m21");
    searchbox.submit();
   
    String firstWndName = driver.getWindowHandle();
    System.out.println(firstWndName);
    WebElement link1 = driver.findElement(By.xpath("(//a[contains(.,'Samsung Galaxy M21')])[1]"));
    link1.click();
    Thread.sleep(1000);
   
    
    for(String handlename:driver.getWindowHandles()) {
        if(!handlename.equals(firstWndName)){
            driver.switchTo().window(handlename);
            Thread.sleep(1000);
            WebElement addtocart = driver.findElement(By.xpath("//input[contains(@value,'Add to Cart')]"));
            addtocart.click();
        }
    }
    driver.quit();
}

}
