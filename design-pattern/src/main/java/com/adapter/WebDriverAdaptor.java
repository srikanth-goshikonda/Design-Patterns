package com.adapter;

public class WebDriverAdaptor implements WebDriver {

	private IEDriver driver = new IEDriver();

	@Override
	public void getElement() {
		// TODO Auto-generated method stub
		this.driver.findElement();
	}

	public WebDriverAdaptor(IEDriver driver) {
		super();
		this.driver = driver;
	}

	@Override
	public void SelectElement() {
		// TODO Auto-generated method stub
		this.driver.clickElement();
	}

}
