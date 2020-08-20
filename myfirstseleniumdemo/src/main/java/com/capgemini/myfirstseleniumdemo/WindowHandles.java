package com.capgemini.myfirstseleniumdemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandles{
   public static void main(String[] args) throws Exception {
	   WindowHandles hand = new WindowHandles();
	   hand.windowHandle();
   }
	
   public void windowHandle() throws Exception {
	   System.out.println("This Web URl");
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\bgunukul\\Downloads\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.tutorialspoint.com/index.htm");
      String current = driver.getWindowHandle();
      System.out.println(current);
      Set<String> allWindows = driver.getWindowHandles();
      Iterator<String> i = allWindows.iterator();
      while(i.hasNext()){
         String childwindow = i.next();
         if(!childwindow.equalsIgnoreCase(current)){
            driver.switchTo().window(childwindow);
            System.out.println("The child window is "+childwindow);
         } else {
            System.out.println("There are no children");
         }
      }
      driver.quit();
   }
}

