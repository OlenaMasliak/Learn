import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch {

    WebDriver driver;

    @Test
    public void test001() {

        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
        driver = new FirefoxDriver();

        openManePage();
        typeQuery();
        submitSearch();
        waitForResult();
        assertResultPage();


    }
    // TODO: automate search on BING.com
    @Test
    public void test002 () {

    }

    private void waitForResult() {
        By resultStatsElement = By.id("resultStats");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultStatsElement));
    }

    private void assertResultPage() {
        WebElement resultsStatsElement = driver.findElement(By.id("resultStats"));
       boolean isElementDisplayed = resultsStatsElement.isDisplayed();
       boolean expectedResult = true;
       Assert.assertEquals(isElementDisplayed, expectedResult);
    }

    private void submitSearch() {
        WebElement searchInput = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
        searchInput.submit();

    }

    private void typeQuery() {
       WebElement searchInput = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));

       searchInput.sendKeys("portnov computer school");

    }

    private void openManePage() {

        String URL = "https://google.com";
        driver.get(URL);

    }

}
