package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageobjects extends basepage {
	
	@FindBy(xpath = "//*[text()='Women']")
	private WebElement women;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresses;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tshirts;
	
	@FindBy(xpath= "//*[@id='newsletter-input']")
			private WebElement newsletter;
	@FindBy(xpath= "//div/form/div/*[@class='btn btn-default button button-small']")
	private WebElement clickemail;
	
	@FindBy(xpath="//*[@class='alert alert-success']")
	private WebElement alert;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement small;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement medium;
	
	@FindBy(xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement large;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement fiveproductstring;
	
	
	public homepageobjects() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomenTab() {
		return women;
	}
	public WebElement getDressesTab() {
		return dresses;
	}
	public WebElement gettShirtTab() {
		return tshirts;
	}
	public String womenPageNavi()	{
		women.click();
		return driver.getTitle();
	}
	public String dressesPageNavi()	{
		dresses.click();
		return driver.getTitle();
	}
	public String tshirtsPageNavi()	{
		tshirts.click();
		return driver.getTitle();
	}
	
	public void getNewsLetterBox()	{
		dresses.click();
		newsletter.sendKeys("gak12smile@gmail.com");
	}
	public void getClickEmailButton()	{
		clickemail.click();
	}
	
	public String alertpopup()	{
		return alert.getText();	}
	
		public WebElement verifysizes()	{
			dresses.click();
			return small;			
		}
		public WebElement verifysizem()	{
			dresses.click();
			return medium;			
		}
		public WebElement verifysizel()	{
			dresses.click();
			return large;			
		}
		public int getProductNumber()	{
			String text=fiveproductstring.getText();
			String [] arr=text.split(" ");
			String textNumber=arr[2];
			int number=Integer.parseInt(textNumber);
			return number;
		}
}
