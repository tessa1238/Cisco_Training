package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
WebDriver driver;

@Test
public void f() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\tessath\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
driver = new ChromeDriver();
Thread.sleep(20);
driver.get("https://www.google.com");


}
}
