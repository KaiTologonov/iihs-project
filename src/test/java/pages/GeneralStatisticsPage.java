package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class GeneralStatisticsPage {

	public GeneralStatisticsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "(//h1)[1]")
	public WebElement generalStatisticsText;
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle btn'])[2]")
	public WebElement allFatalityFactsTopics;
	
	List<WebElement> topics = Driver.getDriver().findElements(By.xpath("(//a[@class='dropdown-toggle btn'])[2])"));
	
	
	@FindBy(linkText = "Yearly snapshot")
	public WebElement yearlySnapshot;
	
	@FindBy(xpath = "(//a[@class='dropdown-toggle btn'])[1]")
	public WebElement yearlyDropbox;
	
	@FindBy(linkText = "2011")
	public WebElement year2011;
	
	@FindBy(linkText = "Children")
	public WebElement children;
	
	@FindBy(linkText = "Age and gender")
	public WebElement ageGender;
	
	@FindBy(xpath = "(//th[@class='table-title'])[13]")
	public WebElement crashMillChildrenUnder132011;
	
	@FindBy(xpath = "(//*[contains(text(),'494')])[4]")
	public WebElement maleDeaths2011;
	
	
	
	
	
	
}
