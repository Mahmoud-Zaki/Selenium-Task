package Base;

import Utilies.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseClass {
    private final WebDriver driver = HelperClass.getDriver();
    private final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    protected void clickOn(By element){
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",webElement);

    }
    protected void sendKeys(By element,String text){
        WebElement element1 = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        element1.clear();
        element1.sendKeys(text);
    }
    protected String getText(By element){
        return wait.until(ExpectedConditions.presenceOfElementLocated(element)).getText();
    }
    protected void selectByText(By element,String txt){
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(element));
        Select select = new Select(webElement);
        select.selectByVisibleText(txt);
    }
    protected WebElement waitToPresent(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }
    protected void scrollTo(By element){
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", webElement);
    }
}