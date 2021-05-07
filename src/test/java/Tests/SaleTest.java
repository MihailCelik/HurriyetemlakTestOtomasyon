package Tests;

import PageModel.SaleModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class SaleTest {

    SaleModel saleModel = new SaleModel();

    @Step("Make a search: Izmir - Bornova; İş Yeri; Fiyat : 100.000 TL - 2.000.000 TL; Bina Yaşı: Sıfır Bina, 1-5, 6-10;")
    public void saleFilterSearch(){
        Assert.assertEquals("Hürriyet Emlak Satılık sayfasi acilmadi", "Satılık Konut İlanları",saleModel.chekIfSalePage());
        saleModel.clickCountry();
        saleModel.setTextCountrySearch("İzmir");
        saleModel.clickRadioButtonCountry();
        saleModel.clickTown();
        saleModel.setTextTownSearch("Bornova");
        saleModel.clickRadioButtonTown();
        saleModel.clickCategoryWorkPlace();
        saleModel.scrollElement("600");
        saleModel.setTextPriceMinimum("100000");
        saleModel.setTextPriceMaximum("2000000");
        saleModel.clickBuildingAge();
        saleModel.clickZeroBuilding();
        saleModel.clickFiveBuilding();
        saleModel.clickOneBuilding();
        saleModel.clickOkPopup();
    }

    @Step("Click Search")
    public void clickSearch(){
        saleModel.clickSearch();
    }

    @Step("Check for Tags in the filter area: Izmir - Bornova; İş Yeri; 100.000 TL - 2.000.000 TL; Sıfır Bina, 1-5, 6-10;")
    public void chekIfFilterArea(){
        Assert.assertEquals("İl filtre alanı doğru değil", "İzmir",saleModel.chekIfFilterAreaCountry());
        Assert.assertEquals("İlçe filtre alanı doğru değil", "Bornova",saleModel.chekIfFilterAreaTown());
        Assert.assertEquals("Kategori filtre alanı doğru değil", "İşyeri",saleModel.chekIfFilterAreaCategory());
        Assert.assertEquals("Fiyat filtre alanı doğru değil", "100.000 TL - 2.000.000 TL",saleModel.chekIfFilterAreaPrice());
        Assert.assertEquals("Bina Yaşı filtre alanı doğru değil", "Sıfır Bina",saleModel.chekIfFilterAreaZeroBuilding());
        Assert.assertEquals("Bina Yaşı filtre alanı doğru değil", "1-5",saleModel.chekIfFilterAreaFiveBuilding());
        Assert.assertEquals("Bina Yaşı filtre alanı doğru değil", "6-10",saleModel.chekIfFilterAreaOneBuilding());
    }

    @Step("Make a search: Ankara - Çankaya; Konut; 2+1; Site İçerisinde: Evet ;")
    public void rentFilterSearch(){
        Assert.assertEquals("Hürriyet Emlak Kiralık sayfasi acilmadi", "Kiralık Konut İlanları",saleModel.chekIfSalePage());
        saleModel.clickCountry();
        saleModel.setTextCountrySearch("Ankara");
        saleModel.clickRadioButtonCountry();
        saleModel.clickTown();
        saleModel.setTextTownSearch("Çankaya");
        saleModel.clickRadioButtonTown();
        saleModel.clickCategoryHousing();
        saleModel.scrollElement("600");
        saleModel.clickNumberOfRoomsAndLivingRooms();
        saleModel.clickNumberOfRooms();
        saleModel.scrollElement("1000");
        saleModel.clickInsideTheSite();
        saleModel.clickOkPopup();
        saleModel.clickSearchButton();
    }

    @Step("Click on the 3rd listing on the results and go to listing detail page.")
    public void selectedFirstHouseForRent(){
        saleModel.scrollElement("5000");
        saleModel.clickThirdPage();
        saleModel.clickFirstHouseForRent();
    }

    @Step("WEB: On the Detail page there is a “Show Phone Number” link on the right.")
    public void firstHouseForRentDetailPage(){
        saleModel.scrollElement("200");
        saleModel.clickShowPhoneNumber();
    }

    @Step("Validate the phone number that it is a real and valid mobile or landline number. (eg.+905xxxxxxxxx , +90212xxxxxxx)")
    public void validateThePhoneNumber(){
        Assert.assertEquals("telefon numarası doğrulanamadı", "0312",saleModel.clickValidateThePhoneNumber());
    }
}
