package resource.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static resource.utils.RunTest.driver;

public class PatternMatcherExample {

    public static void main(String[] args) {

        driver.navigate().to(Env.google_page);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.id("rcnt"));
        search.getText();

        String text    =
                "This is the text to be searched " +
                        "for occurrences of the http:// pattern.";


        String patternString = String.valueOf(search);

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        boolean matches = matcher.matches();

        System.out.println("matches = " + matches);
    }
}