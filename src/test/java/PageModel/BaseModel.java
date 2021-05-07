package PageModel;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel extends Driver {

    WebDriverWait wait = new WebDriverWait(webDriver,1000);


    public WebElement findElement(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webDriver.findElement(by);
    }

    public void clickElement(By by) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void sendKeys(By by, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElement(by).sendKeys(text);
    }

    public String getText(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return findElement(by).getText();
    }

    public String getAttribute(By by,String value){
        return findElement(by).getAttribute(value);
    }

    public void scrollToElement(String scroll) {

        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("window.scrollBy(0," + scroll + ")");
    }

    public void sleep(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
