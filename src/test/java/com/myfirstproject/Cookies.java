package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import java.util.Set;

public class
Cookies extends TestBase {

        //    Go to amazon  and automate the tasks:
        //    Find the total number of cookies
        //    Print all the cookies
        //    Get the cookies by their name
        //    Add new cookie
        //    Delete all cookies
    @Test
    public void cookiesTest(){
        //  Go to amazon
        driver.get("https://www.amazon.com/");

        //   Find the total number of cookies
        System.out.println(driver.manage().getCookies().size());
        Set<Cookie> cookieList = driver.manage().getCookies();
        System.out.println("Number of Cookies: "+cookieList.size());
        System.out.println("==============================");
        //        Print all the cookies
                for (Cookie eachCookie : cookieList){
                    System.out.println(eachCookie);
                    System.out.println("Cookie Name = " + eachCookie.getName());
                    System.out.println("Cookie Value = " + eachCookie.getValue());
                }
        //        Get the cookies by their name
                System.out.println("==============================");
                System.out.println(driver.manage().getCookieNamed("sp-cdn"));

        //       Add new cookie
                Cookie myFavCookie = new Cookie("my cookie", "login-cookie");
                driver.manage().addCookie(myFavCookie);
                for (Cookie eachCookie : driver.manage().getCookies()){
                    System.out.println(eachCookie);
                }
                System.out.println("==============================");

        //        Delete all cookies
                driver.manage().deleteAllCookies();
                System.out.println("Number of Cookies after deleting: " + driver.manage().getCookies().size());
    }
}


