package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class HomeTest {

    HomeModel homeModel = new HomeModel();

    @Step("Go to Main Page")
    public void userVisitSite(){
        homeModel.userVisitSite();
        Assert.assertEquals("Hürriyet Emlak sayfasi acilmadi", "Hürriyet Emlak",homeModel.chekIfOpenPage());
    }

    @Step("Click on “Satılık”")
    public void clickForSale(){
        homeModel.clickForSale();
    }

    @Step("Click on “Kiralık”")
    public void clickForRent(){
        homeModel.clickForRent();
    }
}
