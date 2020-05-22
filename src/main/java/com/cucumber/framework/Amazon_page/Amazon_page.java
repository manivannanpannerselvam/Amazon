package com.cucumber.framework.Amazon_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.Wait.WaitHelper;
import com.cucumber.framework.helper.genericHelper.GenericHelper;

public class Amazon_page {
	
	WebDriver driver;
	//private final Logger log = LoggerHelper.getLogger(Create_new_account_page.class);
	WaitHelper waitHelper;
	Actions actions;
	
	
	@FindBy(xpath=".//div[@class='nav-search-scope nav-sprite']")
	WebElement Select_Electronic;
	
	@FindBy(xpath=".//select[@aria-describedby='searchDropdownDescription']")
	WebElement Select_Electronis;
	
	@FindBy(xpath=".//input[@id='twotabsearchtextbox']")
	WebElement Search_product_name;
	
	@FindBy(xpath=".//div[@class='nav-search-submit nav-sprite']")
	WebElement Search_icon;
	
	@FindBy(xpath=".//span[text()='Television & Video']")
	WebElement Television_video;
	
	@FindBy(xpath=".//span[@class='nav-a-content']//preceding::a[@tabindex='54']")
	WebElement Televisions;
	
	@FindBy(xpath=".//span[text()='32 Inches & Under']")
	WebElement Inches_under;
	
	
	@FindBy(xpath=".//span[@id='a-autoid-0-announce']")
	WebElement Sort_by_search;
	
	@FindBy(xpath=".//a[text()='Price: High to Low']")
	WebElement Price_High_to_Low;
	
	@FindBy(xpath=".//span[text()='2017']")
	WebElement year_2017;
	
	@FindBy(xpath=".//a[@id='wishListMainButton-announce']")
	WebElement Addcard_List;
	
	@FindBy(xpath=".//input[@id='continue']")
	WebElement verify_Sigin_screen;
	
	@FindBy(xpath=".//input[@id='ap_email']")
	WebElement username;
	
	public Amazon_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//
	}
	
	public void username(String username) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.username.sendKeys(username);
	}
	public boolean verify_Sigin_screen()
	{
		return new GenericHelper().isDisplayed(verify_Sigin_screen);
	}
	
	public void Addcard_List() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Addcard_List,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Addcard_List,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Addcard_List);
		
		actions.click().build().perform();
	}
	
	public void year_2017() throws InterruptedException
	{
		waitHelper.waitForElement(driver, year_2017,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, year_2017,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(year_2017);
		
		actions.click().build().perform();
	}
	
	public void Price_High_to_Low() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Price_High_to_Low,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Price_High_to_Low,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Price_High_to_Low);
		
		actions.click().build().perform();
	}
	
	public void Sort_by_search() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Sort_by_search,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Sort_by_search,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Sort_by_search);
		
		actions.click().build().perform();
	}
	
	public void Inches_under() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Inches_under,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Inches_under,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Inches_under);
		
		actions.click().build().perform();
	}
	
	
	public void Televisions() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Televisions,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Televisions,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Televisions);
		
		actions.click().build().perform();
	}
	
	public void Television_video() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Television_video,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Television_video,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Television_video);
		
		actions.click().build().perform();
	}
	
	public void Search_icon() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Search_icon,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Search_icon,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Search_icon);
		
		actions.click().build().perform();
	}
	
	public void Select_Electronic() throws InterruptedException
	{
		waitHelper.waitForElement(driver, Select_Electronic,ObjectRepo.reader.getPageLoadTimeOut());
		waitHelper.waitForElement(driver, Select_Electronic,ObjectRepo.reader.getExplicitWait());
		
		actions = new Actions(driver);
		actions.moveToElement(Select_Electronic);
		
		actions.click().build().perform();
	}
	
	public void Select_Electronis(String Select_Electronis)
	{
		new Select(this.Select_Electronis).selectByVisibleText(Select_Electronis);
	}
	
	public void Search_product_name(String Search_product_name) throws InterruptedException
	{
		//log.info("entering sigin_password." + sigin_password);
		this.Search_product_name.sendKeys(Search_product_name);
	}
	
	
	

	
	
	

}
