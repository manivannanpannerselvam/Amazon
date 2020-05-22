package com.cucumber.framework.stepdefinition.Amazon_step;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.framework.Amazon_page.Amazon_page;
import com.cucumber.framework.configreader.ObjectRepo;
import com.cucumber.framework.helper.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazon_steps {
	
	
Amazon_page Amazon_Page;

@Given("^open the valid url in Amazon application$")
public void open_the_valid_url_in_Amazon_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	TestBase.driver.get(ObjectRepo.reader.getWebsite());
}


@Then("^click the dropdown icon in search field$")
public void click_the_dropdown_icon_in_search_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);
	Amazon_Page.Select_Electronic();
}
@Then("^Select the Product name is department \"([^\"]*)\"$")
public void select_the_Product_name_is_department(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);
	Amazon_Page.Select_Electronis(arg1);
}

@Then("^Search for products by DepartMent Name \"([^\"]*)\"$")
public void search_for_products_by_DepartMent_Name(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);
	
	Amazon_Page.Search_product_name(arg1);
	
}

@Then("^click the search icon$")
public void click_the_search_icon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);

	Amazon_Page.Search_icon();
	
}
@Then("^click  Televisions & Video$")
public void click_Televisions_Video() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);

	Amazon_Page.Television_video();
}
@Then("^click the Televison Menu$")
public void click_the_Televison_Menu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);

	Amazon_Page.Televisions();
}
@Then("^Select television that are under inches in screen size$")
public void select_television_that_are_under_inches_in_screen_size() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);

	Amazon_Page.Inches_under();
}


@Then("^Select the Price High to Low$")
public void select_the_Price_High_to_Low() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);

	Amazon_Page.Sort_by_search();

	Amazon_Page.Price_High_to_Low();
}

@Then("^Select the Model Year (\\d+)$")
public void select_the_Model_Year(int arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);

	Amazon_Page.year_2017();
	
}

@Then("^Click on the product link for the first product in search result$")
public void click_on_the_product_link_for_the_first_product_in_search_result() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);

	List<WebElement> FirstProduct=TestBase.driver.findElements(By.xpath(".//span[contains(text(),'2017 Model')]"));
	
	System.out.println(FirstProduct.size());

	for(int i=0;i<=FirstProduct.size();i++)
	{
		if(i==1)
		{
			FirstProduct.get(i).click();
			
			break;
			
		}
		
	}
}
@Then("^click the Add link icon$")
public void click_the_Add_link_icon() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);
	
	Amazon_Page.Addcard_List();
}

@Then("^Verify the sigin_screen is visible or not$")
public void verify_the_sigin_screen_is_visible_or_not() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);
	
	if(Amazon_Page.verify_Sigin_screen())
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}

@Then("^Enter the Username in username field \"([^\"]*)\"$")
public void enter_the_Username_in_username_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	Amazon_Page= new Amazon_page(TestBase.driver);
	
	Amazon_Page.username(arg1);
	
}


}
