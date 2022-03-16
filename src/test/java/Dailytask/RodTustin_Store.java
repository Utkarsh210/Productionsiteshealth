package Dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RodTustin_Store {

    @Test(priority = 30)
    public void RodTustinStoreStatus() throws InterruptedException {
        //driver=initializeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Documents\\GitHub\\Productionsiteshealth\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rodrigos.orderapp.online/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        driver.findElement(By.id("btn_takeout")).click();

        Thread.sleep(5000);

        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("orderstore10")));


        Thread.sleep(9000);
        driver.findElement(By.id("orderstore10")).click();



        Thread.sleep(5000);


        String IndexPage = driver.getCurrentUrl();

        System.out.println(IndexPage);

        String DesiredURL = "https://rodrigos.orderapp.online/Index?OrderType=3";

        boolean ActualUrl = (IndexPage.replaceAll("\\s+", "").equalsIgnoreCase(DesiredURL.trim().replaceAll("\\s+", "")));

        if (ActualUrl != true) {

            Assert.fail("Store is currently offline so the test case got failed");

            driver.close();


        }

        Thread.sleep(5000);
        List<WebElement> timeslots = driver.findElements(By.xpath("//a[contains(@id,'modal')]"));  //Select Asap
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


            WebElement FirstItem = AllItemOnIndexPage.get(60);
            ((WebElement) FirstItem).click();

            Thread.sleep(3000);

            List<WebElement>    AddtoCart=  driver.findElements(By.xpath("//button[contains(@onclick,'Javascript:$')]"));

            AddtoCart.get(59).click();

           // driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[65]/div/div/div[3]/button")).click();


        }

        WebElement CheckoutButton = driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a"));
        Thread.sleep(6000);
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

        String DesiredCheckoutPageURL = "https://rodrigos.orderapp.online/Checkout";


        boolean CheckoutPageActualUrl = (CheckoutPageURL.replaceAll("\\s+", "").equalsIgnoreCase(DesiredCheckoutPageURL.trim().replaceAll("\\s+", "")));

        if (CheckoutPageActualUrl != true) {

            Assert.fail("Script is Not able to go to checkout Page So the test case failed");


        }


        Thread.sleep(3000);

        WebElement PhoneNumber = driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]"));
        PhoneNumber.sendKeys("9915493895");


        Thread.sleep(5000);

        // WebElement ContinueButton = driver.findElement(By.xpath("//*[@id=\"changeNo\"]"));

        // ContinueButton.click();

        // Thread.sleep(5000);


        WebElement StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a"));

        String StoreOnlineStatus = StoreStatus.getText();

        System.out.println(StoreOnlineStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreOnlineStatus1 = StoreOnlineStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreOnlineStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreOnlineStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("rod Tustin Store is online: So the Test case is  PASS");
        } else {


            Assert.fail(" rod Tustin Store is offline : So the test case is FAIL");

            driver.close();

        }

        driver.close();



    }
}
