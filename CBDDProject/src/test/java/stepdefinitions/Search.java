package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
 
	 @Given("^I visit the website as a guest user$")
	    public void i_visit_the_website_as_a_guest_user()  {
	      
		 System.out.println(">> - Given I visit the website as a guest user");
	    }

	    @When("^I select books option from the dropdown$")
	    public void i_select_books_option_from_the_dropdown()  {
	    	
	    	System.out.println(">> - I select books option from the dropdown");
	    	
	    }

	    @When("^I select baby option from the dropdown$")
	    public void i_select_baby_option_from_the_dropdown() {
	    	
	    	System.out.println(">> - I click on search icon option");
	        
	    }

	    @Then("^I should see the page with books search results$")
	    public void i_should_see_the_page_with_books_search_results()  {
	    	
	    	System.out.println(">> - I should see the page withbooks search results");
	        
	    }

	    @Then("^I should see the page having heading as offers on baby products$")
	    public void i_should_see_the_page_having_heading_as_offers_on_baby_products()  {
	    	
	    	System.out.println(">> - I should see the page having heading as offers on baby products");
	        
	    }

	    @And("^I click on search icon option$")
	    public void i_click_on_search_icon_option()  {
	    	
	    	System.out.println(">> - I click on search icon option");
	        
	    }

	    @But("^I should not see other product category$")
	    public void i_should_not_see_other_product_category()  {
	    	
	    	System.out.println(">> - I should not see other product category");
	        
	    }

}
