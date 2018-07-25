 package steps;

import static org.testng.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GeneralStatisticsPage;
import utilities.Config;
import utilities.Driver;

public class StatisticsPageStepDef {

	GeneralStatisticsPage genStatsPage = new GeneralStatisticsPage();
	
	

	@Given("user goes to the overview of fatality facts page")
	public void user_goes_to_the_overview_of_fatality_facts_page() {
//		Driver.getDriver().get(Config.getProperty("url"));
//	    genStatsPage.allFatalityFactsTopics.click();
//	    assertTrue(genStatsPage.yearlySnapshot.isDisplayed());
		System.out.println("Hi");
	}

	@When("user clicks on fatality facts")
	public void user_clicks_on_fatality_facts() {
	   
	}

	@Then("user clicks on yearly snapshot")
	public void user_clicks_on_yearly_snapshot() {
	   
	}

	@Then("user can see yearly snapshot dislpayed")
	public void user_can_see_yearly_snapshot_dislpayed() {
	   
	}
}
