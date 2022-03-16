package Dailytask;

import groovyjarjarpicocli.CommandLine;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.LineNumberReader;

public class SingleSpeed_Store {
public HashMap map=new HashMap();

    @Test(priority = 20)
    public void singlespeed_StoreStatus() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\GitHub\\Productionsiteshealth\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        //   driver.get("https://singlespeed.orderapp.online/");

        //   driver.manage().window().maximize();
        //   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


        /**************************************Get client config Validation  *************************************************/










        /**************************************Fetch Menu Validation  *************************************************/


        RestAssured.baseURI = "https://singlespeedposapi.techryde.com/POSAPI";//https://qaposapi.techryde.com/POSAPI//singlespeedposapi


        //Response Object


        RequestSpecification httpRequests = RestAssured.given();


        //Request  Payload sending along with post request


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
        MiCollection miCollection=new MiCollection();
        Integer hello=miCollection.getCollectionId();



        Response responsemenu = httpRequests.request(Method.POST, "/FetchMenu");


        // print response in console window

        String ResponseBodyofmenu = responsemenu.getBody().asString();

        System.out.println("Response Body is " + ResponseBodyofmenu);


        String StatusLine = responsemenu.getStatusLine();




        System.out.println("Status line is " + StatusLine);
        Assert.assertEquals(StatusLine, "HTTP/1.1 200 OK", "No Menu found");


/**************************************Store Online Status Validation  *************************************************/





        //Specify base url

        RestAssured.baseURI = "https://singlespeedposapi.techryde.com/PosApi/OnlineTest/IsOnline";

        //Request Object

        RequestSpecification httpRequest = RestAssured.given();

        //Response Object

        Response response = httpRequest.request(Method.GET, "/2/1/");

        // print response in console window



        String ResponseBody = response.getBody().asString();

 //       JsonPath json=response.jsonPath();

   // Single Singleresponse=response.body().as(Single.class);


     // Boolean code =Singleresponse.getResponseCode();

       //System.out.println(Singleresponse.getResponseCode());

       // System.out.println(Menuresponse.getMenuName());
//        System.out.println(Menuresponse.getPromiseTime());

       // System.out.println("hello"+he);

        System.out.println("Response Body is " + ResponseBody);


        Assert.assertEquals(ResponseBody, "Success", "Store "+ResponseBody);





    }


}