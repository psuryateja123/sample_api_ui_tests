package resource.page_objects;

import org.jsoup.Jsoup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import resource.utils.Env;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class news_search_story_pageObjects {

    public static WebDriver driver = new ChromeDriver();

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


    public static String first_article(){
        List<WebElement> listOfElements = driver.findElements(By.className("fc-item__header"));
        String first_article_heading = listOfElements.get(0).getText();
       // System.out.println(first_article_heading);
            return first_article_heading;
    }

    public static void search_in_google(){
        String article = first_article();
        driver.navigate().to(Env.google_page);
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        //String result = article.replaceAll("[-+.^:,]","");
        search.sendKeys(article);
        search.sendKeys(Keys.ENTER);
        WebElement search_results_1 = driver.findElement(By.className("LC20lb"));
        String patternString = String.valueOf(search_results_1.getText());
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(patternString);
        boolean matches = matcher.matches();
        System.out.println("matches = " + matches);
        }
    }

