package Dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Adelphia_Store {


    @Test(priority = 19)
    public void AdelphiaStoreStatus() throws InterruptedException {
        // driver=initializeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\GitHub\\Productionsiteshealth\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://adelphia.orderapp.online");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        driver.findElement(By.id("btn_takeout")).click();

        Thread.sleep(5000);

        String IndexPage = driver.getCurrentUrl();

        System.out.println(IndexPage);

        String DesiredURL = "https://adelphia.orderapp.online/Index?OrderType=3";

        boolean ActualUrl = (IndexPage.replaceAll("\\s+", "").equalsIgnoreCase(DesiredURL.trim().replaceAll("\\s+", "")));

        if (ActualUrl != true) {

            Assert.fail("Store is currently offline so the test case got failed");

            driver.close();


        }

        Thread.sleep(5000);

        List<WebElement> timeslots = driver.findElements(By.xpath("//a[contains(@id,'modal')]"));  //Select Asap
        System.out.println(timeslots.size());


        if (timeslots.size() == 0) {

            System.out.println("There is no time slot available currently on index page so the test case fails ");


            driver.close();

        } else {

            WebElement FirstSlot = timeslots.get(0);
            ((WebElement) FirstSlot).click();

        }

        Thread.sleep(6000);

        List<WebElement> AllItemOnIndexPage = driver.findElements(By.xpath("//a[contains(@href,'javascript')]"));  //Select Asap
        System.out.println(AllItemOnIndexPage.size());

        if (AllItemOnIndexPage.size() == 0) {

            System.out.println("There is no Menu available currently on index page so the test case fails ");

            driver.close();

        } else {


            WebElement FirstItem = AllItemOnIndexPage.get(1);
            ((WebElement) FirstItem).click();

            Thread.sleep(3000);

            List<WebElement>    AddtoCart=  driver.findElements(By.xpath("//button[contains(@onclick,'Javascript:$')]"));

            AddtoCart.get(0).click();

           // driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[6]/div/div/div[3]/button")).click();


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

        String DesiredCheckoutPageURL = "https://adelphia.orderapp.online/Checkout";


        boolean CheckoutPageActualUrl = (CheckoutPageURL.replaceAll("\\s+", "").equalsIgnoreCase(DesiredCheckoutPageURL.trim().replaceAll("\\s+", "")));

        if (CheckoutPageActualUrl != true) {

            Assert.fail("Script is Not able to go to checkout Page So the test case failed");


        }


        Thread.sleep(3000);

        WebElement PhoneNumber = driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]"));
        PhoneNumber.sendKeys("9915493895");



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

            System.out.println("Adelphia Store is online: So the Test case is  PASS");
        } else {


            Assert.fail(" Adelphia Store is offline : So the test case is FAIL");

            driver.close();

        }


      driver.close();

        /*
         <test verbose="3" preserve-order="true" name="C:\Users\Administrator\IdeaProjects\Productionsiteshealth\src\test\java\EmailFireAfterSuit">
        <classes>
            <class name="EmailFireAferSuit.Email"><methods><include name="Send_update"/></methods></class>
        </classes>
    </test>

         */

    }
}

