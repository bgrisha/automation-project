package tests;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

import java.io.IOException;

import org.testng.Reporter;

import static org.testng.Assert.*;

public class FirstTest extends BasePage {

    @BeforeTest
    public void setUp() {
        super.setUp();
    }

    // assert title is -  דף הבית, הביטוח הלאומי
    @Test(priority = 1)
    public void searchTitle() {
        Assert.assertEquals("דף הבית, הביטוח הלאומי", driver.getTitle());
        System.out.println("Page Title is :" + driver.getTitle());

// assert personal service  exist (שירות אישי)
    }

    @Test(priority = 2)
    public void personalService() {
        homePage.searchSubmit();
        assertNotNull(utilities.waitForElement(searchPage.personalService(), 20));
    }

    // assert telephon is 04-8812345
    @Test(priority = 3)
    public void searchTelephon() {
        assertNotNull(utilities.waitForElement(searchPage.searchTelephon(), 20));
        String actualTel1 = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/span[2]")).getText();
        assertTrue(actualTel1.contains("04-8812345"), "This is not right number");

// assert telephon is *6050
    }

    @Test(priority = 4)
    public void searchTelephon2() {
        assertNotNull(utilities.waitForElement(searchPage.searchTelephon(), 20));

        String actualTel2 = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/span[1]")).getText();
        assertTrue(actualTel2.contains("*6050"), "This is not right number");

// search logo exist
    }

    @Test(priority = 5)
    public void searchFlag() {

        assertNotNull(utilities.waitForElement(searchPage.searchFlag(), 20));
    }

    //Exhaustion Of Rights (מיצוי זכויות)
    @Test(priority = 6)
    public void CitizensRights() {
        homePage.searchSubmit();
        assertNotNull(utilities.waitForElement(searchPage.CitizensRights(), 20));

    }

    //Exhaustion Of Rights of the sicks (זכויות החולה)
    @Test(priority = 7)
    public void CitizensSick() {

        homePage.searchSubmit();
        assertNotNull(utilities.waitForElement(searchPage.CitizensSick(), 20));

    }

    //Search for branches (סניפים)
    @Test(priority = 8)
    public void InputCity() {
        homePage.searchSubmit();
        assertNotNull(utilities.waitForElement(searchPage.InputCity(), 20));


    }
//    @Test (priority = 9)
//    public void InputBranch(){
//        homePage.searchSubmit();
//       utilities.waitForElement(searchPage.InputCity(),20);
//
//
//
//        homePage.searchInput("Tel Aviv");
//
//        assertNotNull(utilities.waitForElement(searchPage.InputBranch(), 20));
//
//
//    }


    public void tearDown() throws IOException {
        // utilities.screenshot();
        super.tearDown();
    }

}