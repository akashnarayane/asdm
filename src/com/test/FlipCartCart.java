package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipCartCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\37_40\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		/*
		 * WebElement signIn =
		 * chrome.findElementByXPath("//*[@id=\"gnavAccountMenu\"]/span");
		 * Thread.sleep(1000);
		 * 
		 * Actions mouseHover = new Actions(chrome);
		 * mouseHover.moveToElement(signIn).build().perform();
		 * 
		 * 
		 * chrome.findElementByXPath(
		 * "//*[@id=\"vzw-gn\"]/div/nav/div/div[2]/div[3]/ul[2]/li[3]/ul/li[1]/a").click
		 * ();
		 */
	}

}
