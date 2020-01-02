package resource.utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:test-html-report","json:target/test-report.json"},
        tags = {"@smoke"},
        glue = {"resource.step_defs"},
        features = {"resource.feature_files"})

public class RunTest {

    public static WebDriver driver;
    static boolean ci = false;
    @BeforeClass
    public static void start() {
        System.out.println("Starting browser ...... " + resource.utils.Env.browser);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("Chrome");
        System.out.println("Checking the home page is shown......");
    }

    @AfterClass
    @After
    public static void stop()
    {
        driver.close();
        driver.quit();
    }

}
