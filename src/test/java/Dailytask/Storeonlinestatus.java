package Dailytask;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;
//"C:\\Users\\Administrator\\IdeaProjects\\Productionsiteshealth\\"
//Test Results - Storeonlinestatus.html
import java.util.concurrent.TimeUnit;


public class Storeonlinestatus{


    private Object EmailUtil;

    /*
        @Test(priority = 0)
        public void status() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://qoqa.techryde.com");

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click();


            driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap


            Thread.sleep(5000);

            driver.findElement(By.xpath("//a[contains(@href,'javascript')]")).click();//item


            Thread.sleep(5000);

            driver.findElement(By.xpath("//button[contains(@onclick,'Javascript')]")).click();//add to cart


            driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


            Thread.sleep(5000);
            // Guest login

            driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div[1]/a[3]")).click();

            // driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[1]/a[3]")).click();


            driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

            Thread.sleep(5000);


            String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
            System.out.println(StoreStatus);


            //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

            String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

            System.out.println(StoreStatus1);


            String ExpectedStoreStatus = "PlaceOrder";

            boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

            if (ActualStatus) {

                System.out.println("Techryde-In Store is online: So the Test case is  PASS");
            } else {


                Assert.fail(" Techryde-In Store is offline : So the test case is FAIL");


            }


            driver.close();

        }

    */
    @Test(priority = 1)
    public void Dipasquales() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dipasquales.orderapp.online");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap


        Thread.sleep(7000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_1\"]/div[3]/a")).click();

        Thread.sleep(5000);
    //driver.findElement((By.xpath("//*[@id=\"1668-1803-0-2-1-Italian Sub Bread Type\"]")));

        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[7]/div/div/div[3]/button")).click();//add to cart

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);

        //  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div/input[2]")).sendKeys("utkarsh.frend@gmail.com");


        //    Thread.sleep(5000);
        //   driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[1]/div/input")).sendKeys("utkarsh");


        //  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[6]/div/div/button[1]")).click(); //Pay by cash

        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Di Pasquale Store is online: So the Test case is  PASS");
        } else {


            Assert.fail(" Di Pasquale Store is offline : So the test case is FAIL");


        }


        driver.close();

    }

    @Test(priority = 2)
    public void Shoyou() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shoyou.orderapp.online");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        // driver.findElement(By.xpath("//*[@id=\"orderstore5\"]")).click();  // Select Techryde In store


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap

        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_1\"]/div[2]/a")).click();

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-7\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Shoyou Store is online: So the Test case is  PASS");
        } else {


            Assert.fail(" Shoyou Store is offline : So the test case is FAIL");


        }


        driver.close();

    }

    @Test(priority = 3)
    public void Ndasia() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ndasia.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        // driver.findElement(By.xpath("//*[@id=\"orderstore5\"]")).click();  // Select Techryde In store

        driver.findElement(By.xpath("//li[contains(@class,'activeasap')]")).click();  //Select Asap

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"col_33\"]/div[2]/a")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[5]/div/div/div[2]/div/form/div[1]/label/input")).click();  //modifier
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"256-846-0-1-1-LH Soup\"]")).click();  //modifier

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-256\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Nd Asia Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Nd Asia Store is offline : So the test case is FAIL");


        }


        driver.close();

    }

    @Test(priority = 4)
    public void Villagebowl() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://villagebowl.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap


        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_1\"]/div[2]/a")).click();

        Thread.sleep(2000);


        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-69\"]")).click();//add to cart

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);

        //  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div/input[2]")).sendKeys("utkarsh.frend@gmail.com");


        //    Thread.sleep(5000);
        //   driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[1]/div/input")).sendKeys("utkarsh");


        //  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[6]/div/div/button[1]")).click(); //Pay by cash

        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Villagebowl Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Villagebowl Store is offline : So the test case is FAIL");


        }


        driver.close();
    }


    @Test(priority = 5)
    public void ventura() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ventura.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"col_11\"]/div[2]/a")).click();

        Thread.sleep(2000);

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-4\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("ventura Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("ventura Store is offline : So the test case is FAIL");


        }


        driver.close();
    }

    @Test(priority = 6)
    public void Crowsnest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://crowsnest.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        // driver.findElement(By.xpath("//*[@id=\"orderstore5\"]")).click();  // Select Techryde In store


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_2\"]/div[2]/a")).click();

        Thread.sleep(2000);

        // driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[5]/div/div/div[2]/div/form/div[1]/label/input")).click();  //modifier
        //  Thread.sleep(2000);

        //  driver.findElement(By.xpath("//*[@id=\"256-846-0-1-1-LH Soup\"]")).click();  //modifier

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-33\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Crowsnest Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Crowsnest Store is offline : So the test case is FAIL");


        }


        driver.close();
    }

    @Test(priority = 7)

    public void Jcbeans() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jcbeans.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        // driver.findElement(By.xpath("//*[@id=\"orderstore5\"]")).click();  // Select Techryde In store


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_1\"]/div[2]/a")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"553-102-0-1-1-Sizes\"]")).click();  //modifier
        //  Thread.sleep(2000);

        //  driver.findElement(By.xpath("//*[@id=\"256-846-0-1-1-LH Soup\"]")).click();  //modifier

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-553\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Jcbeans Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Jcbeans Store is offline : So the test case is FAIL");


        }


        driver.close();
    }

    @Test(priority = 8)

    public void H2ocean() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://h2ocean.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_3\"]/div[2]/a")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"323-6123-0-1-1-F Onion Soup Cho\"]")).click();  //modifier
        //  Thread.sleep(2000);

        // driver.findElement(By.xpath("//*[@id=\"256-846-0-1-1-LH Soup\"]")).click();  //modifier

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-323\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("H2ocean Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("H2ocean Store is offline : So the test case is FAIL");


        }


        driver.close();

    }

    @Test(priority = 9)

    public void Cosmos() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cosmos.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap


        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_5\"]/div[3]/a")).click();

        Thread.sleep(2000);

        // driver.findElement(By.xpath("//*[@id=\"323-6123-0-1-1-F Onion Soup Cho\"]")).click();  //modifier
        //  Thread.sleep(2000);

        // driver.findElement(By.xpath("//*[@id=\"256-846-0-1-1-LH Soup\"]")).click();  //modifier

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-162\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Cosmos Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Cosmos Store is offline : So the test case is FAIL");


        }


        driver.close();
    }

    @Test(priority = 10)

    public void Romapizza() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://romapizza.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_1\"]/div[2]/a")).click();

        Thread.sleep(2000);


        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-68\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Romapizza  Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Romapizza Store is offline : So the test case is FAIL");


        }


        driver.close();

    }


    @Test(priority = 11)
    public void Wardroom() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wardroom.techryde.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_1\"]/div[2]/a")).click();

        Thread.sleep(2000);


        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[contains(@id,'btn-894')]")).click();//add to cart
        // driver.findElement(By.xpath("//*[@id=\"btn-68\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Wardroom  Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Wardroom Store is offline : So the test case is FAIL");


        }


        driver.close();
    }


    @Test(priority = 12)
    public void Countrypizza() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cnpizza.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_7\"]/div[2]/a")).click();

        Thread.sleep(2000);


        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-2035\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Countrypizza  Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Countrypizza Store is offline : So the test case is FAIL");


        }


        driver.close();
    }


    @Test(priority = 13)
    public void Shorebreak() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://shorebreak.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button

        //driver.findElement(By.xpath("//*[@id=\"orderstore2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"selectdate\"]/div/div/div/div/ul[2]/li")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[5]/div[2]/a")).click();

        Thread.sleep(2000);


        Thread.sleep(5000);


        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[6]/div/div/div[3]/button")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Shorebreak  Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Shorebreak Store is offline : So the test case is FAIL");


        }


        driver.close();

    }


    @Test(priority = 14)
    public void Hapisgah() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hapisgah.orderapp.online");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_23\"]/div[6]/a")).click();

        Thread.sleep(2000);

        // driver.findElement(By.xpath("//*[@id=\"121-223-0-2-1-pasta choice\"]")).click();
        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-1725\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Hapisgah  Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Hapisgah Store is offline : So the test case is FAIL");


        }


        driver.close();


    }
    /*
        @Test(priority = 15)
        public void Bistro() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://bistro.orderapp.online");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


            driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
            Thread.sleep(5000);
            //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


            // Add 1 item without modifier (qty 1) :


            driver.findElement(By.xpath("//*[@id=\"col_1\"]/div[2]/a")).click();

            Thread.sleep(2000);


            Thread.sleep(5000);


            driver.findElement(By.xpath("//*[@id=\"btn-68\"]")).click();//add to cart


            driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


            // Guest login

            driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


            driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

            Thread.sleep(5000);

            driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

            Thread.sleep(5000);


            String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
            System.out.println(StoreStatus);


            //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

            String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

            System.out.println(StoreStatus1);


            String ExpectedStoreStatus = "PlaceOrder";

            boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

            if (ActualStatus) {

                System.out.println("Bistro  Store is online: So the Test case is  PASS");
            } else {


                Assert.fail("Bistro Store is offline : So the test case is FAIL");


            }


            driver.close();


        }

    */
    @Test(priority = 16)
    public void Ananda() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ananda.orderapp.online");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_1\"]/div[2]/a")).click();

        Thread.sleep(2000);


        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-1425\"]")).click();//add to cart


        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Ananda  Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Ananda Store is offline : So the test case is FAIL");


        }


        driver.close();


    }


    @Test(priority = 17)
    public void Aldos() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://aldos.orderapp.online");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button


        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_19\"]/div[3]/a")).click();

        Thread.sleep(2000);


        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-37\"]")).click();//add to cart

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout

        Thread.sleep(2000);
        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Aldo's  Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Aldo's Store is offline : So the test case is FAIL");


        }


        driver.close();


    }



    @Test(priority = 18)
    public void Dannys() throws InterruptedException, EmailException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dennys.orderapp.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"btn_takeout\"]")).click(); //click TA Button

        driver.findElement(By.xpath("//*[@id=\"orderstore1\"]")).click();
        driver.findElement(By.xpath("//a[contains(@id,'modal')]")).click();  //Select Asap
        Thread.sleep(5000);
        //	String color = driver.findElement(By.xpath("//*[@id=\"page-content-wrapper\"]/div[1]/div/div[1]/ul/li/a[2]")).getCssValue("background-color"); // Getting rgba value of the Button


        // Add 1 item without modifier (qty 1) :


        driver.findElement(By.xpath("//*[@id=\"col_1\"]/div[3]/a")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"12-66-0-2-1-Egg Prep\"]")).click();

        Thread.sleep(2000);


        driver.findElement(By.xpath("//*[@id=\"12-116-1-2-1-Meat Choice\"]")).click();

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"btn-12\"]")).click();//add to cart

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"tblCart\"]/tr[1]/td/a")).click(); //checkout


        // Guest login

        driver.findElement(By.xpath("//*[@id=\"CheckoutloginModal\"]/div/div/div[2]/form/div/a[3]")).click();


        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("9915493895");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"changeNo\"]")).click(); // continue

        Thread.sleep(5000);


        String StoreStatus = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td/a")).getText();
        System.out.println(StoreStatus);


        //	 String CheckoutTakeOutServiceCharge = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div/div[1]/table/tbody/tr[5]/td[2]")).getText();

        String StoreStatus1 = StoreStatus.replaceAll("[^A-Za-z]", "");

        System.out.println(StoreStatus1);


        String ExpectedStoreStatus = "PlaceOrder";

        boolean ActualStatus = (StoreStatus1.replaceAll("\\s+", "").equalsIgnoreCase(ExpectedStoreStatus.trim().replaceAll("\\s+", "")));

        if (ActualStatus) {

            System.out.println("Danny's  Store is online: So the Test case is  PASS");
        } else {


            Assert.fail("Danny's Store is offline : So the test case is FAIL");


        }


        driver.close();


    }

}


    /*
    @AfterTest
    @Test(priority = 19)
    public void Send_update (){

        ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:/Users/TestingReport.html");

       // ExtentAventReporter avent = new ExtentAventReporter("/user/build/");
        //ExtentKlovReporter klov = new ExtentKlovReporter("project", "build");

        ExtentReports extent = new ExtentReports();
     ExtentTest  logger =   extent.createTest("Siteshealth");
     logger.log(Status.INFO,"healthtest");

     extent.flush();

        extent.attachReporter(reporter);


    }
    }

    */
// @AfterClass
// @Test(priority = 19)
    /*
     public void Send_update () throws InterruptedException, EmailException {

    final String username = "tselenium94@gmail.com";  // like yourname@outlook.com
    final String password = "Testing@123";   // password here

    Properties props = new Properties();

            props.put("mail.smtp.auth","true");
            props.put("mail.smtp.starttls.enable","true");
            props.put("mail.smtp.host","smtp.gmail.com");
            props.put("mail.smtp.port","587");
            props.put("mail.smtp.socketFactory.port","587");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");


    Session session = Session.getInstance(props, new Authenticator() {

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("tselenium94@gmail.com", "Testing@123");
        }
    });
            session.setDebug(true);

            try

    {

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("utkarsh.frend@gmail.com"));   // like tselenium94@gmail.com
        message.setSubject("Production Stores Online status");
        message.setText("Hi Team, Store online status has been checked for today and please find the stores which are online and offline");


        MimeBodyPart messageBodyPart = new MimeBodyPart();

        Multipart multipart = new MimeMultipart();

        messageBodyPart = new MimeBodyPart();
        String file = "C:\\Users\\Asus\\IdeaProjects\\Productionsitestatushealth\\";
        String fileName = "Test Results - Productiononlinesites.html";
        DataSource source = new FileDataSource(file + fileName);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(fileName);
        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);
        System.out.println("Sending");
        //  fileName.flush();
        Transport.send(message);
        System.out.println("Done");

    } catch(
    MessagingException e)

    {
        throw new RuntimeException(e);
    }
            */


