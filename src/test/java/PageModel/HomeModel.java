package PageModel;

import org.openqa.selenium.By;

public class HomeModel extends  BaseModel{

    public static By tdOldHeader = By.className("he-logo");

    public static By btnForSale = By.xpath("/html/body/div[1]/div/div/section/div[1]/div/div[2]/div/ul/li[1]/a");

    public void userVisitSite(){
        webDriver.get("https://www.hurriyetemlak.com/");
    }

    public static By btnForRent = By.xpath("/html/body/div[1]/div/div/section/div[1]/div/div[2]/div/ul/li[3]/a");


    public String chekIfOpenPage() {
        return getAttribute(tdOldHeader,"alt");
    }

    public void clickForSale(){
        clickElement(btnForSale);
    }

    public void clickForRent(){
        clickElement(btnForRent);
    }
}
