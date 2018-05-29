package HOMEPAGEOBJECTS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepageobjects extends Basepage {

	@FindBy(xpath = "//a[@title='Women']]")
	private WebElement Women;

	@FindBy(xpath = "//']")
	private WebElement Dresses;

	@FindBy(xpath = "//']")
	private WebElement Tshirts;

	public WebElement getWomen() {
		return Women;
	}

	public WebElement getDresses() {
		return Dresses;
	}

	public WebElement getTshirts() {
		return Tshirts;
	}

}