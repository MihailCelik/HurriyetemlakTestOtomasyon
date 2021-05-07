package PageModel;

import org.openqa.selenium.By;

public class SaleModel extends BaseModel {

    public static By rdCategoryHousing = By.cssSelector("section.filter-item-wrap.categoryMainSec > div > ul > li:nth-child(1) > div");
    public static By cboNumberOfRoomsAndLivingRooms = By.cssSelector("section.listing-filter > div > section.roomTypeSec > section > div");
    public static By chkNumberOfRooms = By.cssSelector("section > div > div.dropdown-lightbox > div > div > ul > li:nth-child(3)");
    public static By rdInsideTheSite = By.cssSelector("section.listing-filter > div > section.filter-switch.withinSiteSec");
    public static By btnSearchButton = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[22]/a[1]");
    public static By btnThirdPage = By.cssSelector("section > ul > li:nth-child(4)");
    public static By firstHouseForRent = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[2]");
    public static By btnShowPhoneNumber = By.xpath("/html/body/div[1]/div/div/div/section[3]/div/div[2]/div/section/div/div[2]");
    public static By tdValidateThePhoneNumber = By.xpath("/html/body/div[1]/div/div/div/section[3]/div/div[2]/div/section/div/div[2]/div/ul/li[1]/a/span");
    public static By tdSaleOldHeader = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div[1]/div/h1");
    public static By cboCountry = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[1]/section[1]/div/div/div/div/div/div[1]");
    public static By txtCountrySearch = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[1]/section[1]/div/div/div/div/div/div[2]/input");
    public static By rdCountry = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[1]/section[1]/div/div/div/div/div/div[2]/div/div[1]/ul/li");
    public static By cboTown = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[1]/section[2]/div/div/div/div[1]/span[1]");
    public static By txtTownSearch = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[1]/section[2]/div/div/div/div[2]/input");
    public static By rdTown = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[1]/section[2]/div/div/div/div[2]/div/div[1]/ul/li");
    public static By rdCategoryWorkPlace = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[2]/div/ul/li[2]/div");
    public static By txtPriceMinimum = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[4]/div/div[1]/input");
    public static By txtPriceMaximum = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[4]/div/div[2]/input");
    public static By cboBuildingAge = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[7]/section/div/div[1]/div");
    public static By chkZeroBuilding = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[7]/section/div/div[2]/div/div/ul/li[1]");
    public static By chkFiveBuilding = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[7]/section/div/div[2]/div/div/ul/li[2]");
    public static By chkOneBuilding = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[7]/section/div/div[2]/div/div/ul/li[3]");
    public static By btnSearch = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[2]/div[1]/section[2]/div/section[21]/a[1]");
    public static By btnPopup = By.xpath("/html/body/div[1]/div/div/section/p/span");
    public static By tdFilterAreaCategory = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/ul/li[3]/span[2]");
    public static By tdFilterAreaCountry = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/ul/li[1]/span[2]");
    public static By tdFilterAreaTown = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/ul/li[2]/span[2]");
    public static By tdFilterAreaPrice = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/ul/li[4]/span[2]");
    public static By tdFilterAreaZeroBuilding = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/ul/li[5]/span[2]");
    public static By tdFilterAreaFiveBuilding = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/ul/span[1]");
    public static By tdFilterAreaOneBuilding = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div[2]/ul/span[2]");

    public String chekIfSalePage() {
        return getText(tdSaleOldHeader);
    }

    public void clickCountry(){
        clickElement(cboCountry);
    }

    public void setTextCountrySearch(String country){
        sendKeys(txtCountrySearch,country);
    }

    public void clickRadioButtonCountry(){
        clickElement(rdCountry);
    }

    public void clickTown(){
        sleep(2000);
        clickElement(cboTown);
    }

    public void setTextTownSearch(String town){
        sendKeys(txtTownSearch,town);
    }

    public void clickRadioButtonTown(){
        clickElement(rdTown);
    }

    public void clickCategoryWorkPlace(){
        clickElement(rdCategoryWorkPlace);
        sleep(3000);
    }

    public void setTextPriceMinimum(String priceMinimum){
        sendKeys(txtPriceMinimum,priceMinimum);
    }

    public void setTextPriceMaximum(String priceMaximum){
        sendKeys(txtPriceMaximum,priceMaximum);
    }

    public void clickBuildingAge(){
        clickElement(cboBuildingAge);
    }

    public void clickZeroBuilding(){
        clickElement(chkZeroBuilding);
    }

    public void clickFiveBuilding(){
        clickElement(chkFiveBuilding);
    }

    public void clickOneBuilding(){
        clickElement(chkOneBuilding);
    }

    public void clickSearch(){
        clickElement(btnSearch);
    }

    public void scrollElement(String scroll){
        scrollToElement(scroll);
    }

    public void clickOkPopup(){
        clickElement(btnPopup);
    }

    public String chekIfFilterAreaCountry() {
        return getText(tdFilterAreaCountry);
    }

    public String chekIfFilterAreaTown() {
        return getText(tdFilterAreaTown);
    }

    public String chekIfFilterAreaCategory(){
        return getText(tdFilterAreaCategory);
    }

    public String chekIfFilterAreaPrice() {
        return getText(tdFilterAreaPrice);
    }

    public String chekIfFilterAreaZeroBuilding() {
        return getText(tdFilterAreaZeroBuilding);
    }

    public String chekIfFilterAreaFiveBuilding() {
        return getText(tdFilterAreaFiveBuilding);
    }

    public String chekIfFilterAreaOneBuilding() {
        return getText(tdFilterAreaOneBuilding);
    }

    public void clickCategoryHousing(){
        clickElement(rdCategoryHousing);
        sleep(3000);
    }

    public void clickNumberOfRoomsAndLivingRooms(){
        clickElement(cboNumberOfRoomsAndLivingRooms);
    }

    public void clickNumberOfRooms(){
        clickElement(chkNumberOfRooms);
    }

    public void clickInsideTheSite(){
        clickElement(rdInsideTheSite);
    }

    public void clickSearchButton(){
        clickElement(btnSearchButton);
        sleep(3000);
    }

    public void clickThirdPage(){
        clickElement(btnThirdPage);
        sleep(3000);
    }

    public void clickFirstHouseForRent(){
        clickElement(firstHouseForRent);
        sleep(3000);
    }

    public void clickShowPhoneNumber(){
        clickElement(btnShowPhoneNumber);
        sleep(2000);
    }

    public String clickValidateThePhoneNumber(){
        return getText(tdValidateThePhoneNumber);
    }
}
