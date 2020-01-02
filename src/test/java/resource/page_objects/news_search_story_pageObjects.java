package resource.page_objects;

import org.jsoup.Jsoup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import resource.locators.homepage;
import resource.utils.Env;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class news_search_story_pageObjects {

    public static WebDriver driver = new ChromeDriver();

    // page objects for the UI test

    public static void gaudian_home_page_navigation(){
        driver.navigate().to(Env.guadian_page);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        String newBaseURL = Env.guadian_page;
        String currentURL = driver.getCurrentUrl();
        try{
            Assert.assertEquals(newBaseURL, currentURL);
        }
        catch(Exception e){
            driver.get(newBaseURL);
        }
    }


    // first article found in the guadian page
    public static String first_article(){
        List<WebElement> listOfElements = driver.findElements(By.className(homepage.article_locator));
        String first_article_heading = listOfElements.get(0).getText();
            return first_article_heading;
    }


    // google search and comparing the match
    public static void search_in_google(){
        String article = first_article();
        driver.navigate().to(Env.google_page);
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath(homepage.google_search_tab));
        search.sendKeys(article);
        search.sendKeys(Keys.ENTER);
        WebElement search_results_1 = driver.findElement(By.className(homepage.google_search_results));
        String patternString = String.valueOf(search_results_1.getText());
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(patternString);
        boolean matches = matcher.matches();
        System.out.println("matches = " + matches);
        }
    }

