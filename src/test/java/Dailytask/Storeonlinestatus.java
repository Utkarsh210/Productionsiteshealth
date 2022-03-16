package Dailytask;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.json.simple.JSONObject;
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Properties;
//"C:\\Users\\Administrator\\IdeaProjects\\Productionsiteshealth\\"
//Test Results - Storeonlinestatus.html
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


public class Storeonlinestatus {


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

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\GitHub\\Productionsiteshealth\\chromedriver.exe");
      //  WebDriver driver = new ChromeDriver();



        RestAssured.baseURI = "https://singlespeedposapi.techryde.com/POSAPI";//https://qaposapi.techryde.com/POSAPI//singlespeedposapi

      //  RestAssured.basePath="/FetchMenu";

        RequestSpecification httpRequests = RestAssured.given();

        //Response Object



        //Request  Payload sending a
        //long with post request


        JSONObject requestParams = new JSONObject();

        DateTimeFormatter dateTimeFormat= DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
        String datetime = dateTimeFormat.format(LocalDateTime.now());

        requestParams.put("clientId", 1);
        requestParams.put("storeId", "2");
        requestParams.put("tableNumber", 0);
        requestParams.put("orderTime", datetime);
        requestParams.put("orderType", 1);
        requestParams.put("channelId", 3);
        requestParams.put("isAll", true);

        httpRequests.header("Content-Type", "application/json");

        httpRequests.body(requestParams.toJSONString());

        //Response Object

        Response responsemenu = httpRequests.request(Method.POST, "/FetchMenu");


        // print response in console window

        String ResponseBodyofmenu = responsemenu.getBody().asString();

        System.out.println("Response Body is " + ResponseBodyofmenu);


        String StatusLine = responsemenu.getStatusLine();


        Response response= given().contentType(ContentType.JSON).log().all().get("/FetchMenu");


      ArrayList<String> menus=  given().contentType(ContentType.JSON).log().all().get("/FetchMenu").then().extract().path("menuID");
System.out.println(menus.get(1));




        System.out.println("Status line is " + StatusLine);
        Assert.assertEquals(StatusLine, "HTTP/1.1 200 OK", "No Menu found");








    }


}