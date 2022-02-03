package pages;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SearchPageResult {

    WebDriver driver;
    WebElement element;
    Utilities utilities = new Utilities(driver);


    @FindBy(xpath = "//a[@id='ctl00_Topmneu_HyperLink9']")
    WebElement service;


    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/span[2]")
    WebElement telephon;


    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement telephon2;

    @FindBy(xpath = "//a[@id='ctl00_SiteHeader_HyperLinkHomePage']")
    WebElement Flag;

    @FindBy(xpath = "//a[@id='ctl00_Topmneu_BenefitsHyperLink']")
    WebElement rights;

    @FindBy(xpath = "//a[@id='ctl00_Topmneu_BenefitsHyperLink']")
    WebElement sick;

    @FindBy(xpath = "//a[@id='ctl00_Topmneu_BranchesHyperLink']")
    WebElement city;

    @FindBy(xpath = "//input[@id='ctl00_PlaceHolderMain_snifsearch_snifimSearch']")
    WebElement branch;


    public SearchPageResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement personalService() {

        return service;
    }

    public WebElement searchTelephon() {

        return telephon;
    }

    public WebElement searchTelephon2() {

        return telephon2;
    }

    public WebElement searchFlag() {

        return Flag;
    }

    public WebElement CitizensRights() {

        return rights;
    }

    public WebElement CitizensSick() {

        return sick;
    }

    public WebElement InputCity() {

        return city;
    }

    public WebElement InputBranch() {

        return branch;
    }


}