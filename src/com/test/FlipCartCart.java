package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\37_40\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		
	}

}
