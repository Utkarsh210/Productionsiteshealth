package Dailytask;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dannys_Store{

    @Test(priority = 6)
    public void DannysStoreStatus() throws InterruptedException, IOException {
        // driver=initializeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dennys.orderapp.online");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        // takeScreenshot("Dannys");
        driver.findElement(By.id("btn_takeout")).click();

        Thread.sleep(5000);

        String AllStorePage = driver.getCurrentUrl();

        System.out.println(AllStorePage);

        String DesiredURL = "https://dennys.orderapp.online/AllStore";

        boolean ActualUrl = (AllStorePage.replaceAll("\\s+", "").equalsIgnoreCase(DesiredURL.trim().replaceAll("\\s+", "")));


        if (ActualUrl) {

            driver.findElement(By.id("orderstore1")).click();
            Thread.sleep(4000);


        } else {

            Assert.fail("On Clicking Takeout Button All store page is not opened so the test case got failed");



        }


        String IndexPage = driver.getCurrentUrl();

        String DesiredURL1 = "https://dennys.orderapp.online/Index?OrderType=2";

        boolean ActualUrl1 = (IndexPage.replaceAll("\\s+", "").equalsIgnoreCase(DesiredURL1.trim().replaceAll("\\s+", "")));

        if (ActualUrl1 != true) {

            Assert.fail("On Clicking Store1 On Allstore page , Index page of the website is not opening so the test case got failed");

            driver.close();
        }

        List<WebElement> timeslots = driver.findElements(By.xpath("//a[contains(@id,'modal')] "));  //Select Asap
        System.out.println(timeslots.size());


        if (timeslots.size() == 0) {

            Assert.fail("There is no time slot available currently on index page so the test case fails ");


            driver.close();

        } else {

            WebElement FirstSlot = timeslots.get(0);
            ((WebElement) FirstSlot).click();

        }

        Thread.sleep(6000);

        List<WebElement> AllItemOnIndexPage = driver.findElements(By.xpath("//a[contains(@href,'javascript')]"));  //Select Asap
        System.out.println(AllItemOnIndexPage.size());

        if (AllItemOnIndexPage.size() == 0) {

            Assert.fail("There is no Menu available currently on index page so the test case fails ");

            driver.close();

        } else {


            WebElement FirstItem = AllItemOnIndexPage.get(18);
            ((WebElement) FirstItem).click();

            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[23]/div/div/div[3]/button")).click();


        }


        WebElement CheckoutButton = driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a"));
        CheckoutButton.click();


        Thread.sleep(6000);

        boolean SignInModal = driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).isDisplayed();
        System.out.println(SignInModal);


        if (SignInModal != true) {

            Assert.fail("On Clicking Checkout Button on Index Page Signin In Pop up modal is not opened so the test case got failde");


        }


        WebElement GuestLogin = driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div[1]/a[3]"));
        GuestLogin.click();


        Thread.sleep(5000);

        String CheckoutPageURL = driver.getCurrentUrl();

        String DesiredCheckoutPageURL = "https://dannys.orderapp.online/Checkout";

        boolean CheckoutPageActualUrl = (CheckoutPageURL.replaceAll("\\s+", "").equalsIgnoreCase(DesiredCheckoutPageURL.trim().replaceAll("\\s+", "")));


        if (CheckoutPageActualUrl != true) {

            Assert.fail("Script is Not able to go to checkout Page when clicked checkout button So the test case failed");


        }


        Thread.sleep(3000);

        WebElement PhoneNumber = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
        PhoneNumber.sendKeys("9915493895");


        Thread.sleep(5000);

        WebElement ContinueButton = driver.findElement(By.xpath("//*[@id=\"changeNo\"]"));

        ContinueButton.click();

        Thread.sleep(5000);


        WebElement StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a"));

        String StoreOnlineStatus = StoreStatus.getText();

        System.out.println(StoreOnlineStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreOnlineStatus1 = StoreOnlineStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreOnlineStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreOnlineStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Dennys Store is online: So the Test case is  PASS");
        } else {


            Assert.fail(" Dennys Store is offline : So the test case is FAIL");

            // driver.close();

        }
    }

}
