package com.adapter;

public class MainClass {
	public static void main(String[] args) {
		WebDriver webDriver = new ChromeDriver();
		System.out.println("=========Chrome Drivers==========");
		webDriver.getElement();
		webDriver.SelectElement();

		IEDriver ieDriver = new IEDriver();
		System.out.println("=========IE Drivers==========");
		ieDriver.clickElement();
		ieDriver.findElement();

		System.out.println("=========Adapted IE Drivers to Web Drivers==========");
		WebDriverAdaptor webDriverAdaptor = new WebDriverAdaptor(ieDriver);
		webDriverAdaptor.getElement();
		webDriverAdaptor.SelectElement();

	}
}
