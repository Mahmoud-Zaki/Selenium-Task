package Pages;

import Base.BaseClass;
import Utilies.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class CartPage extends BaseClass {
    final private By firstNameField = By.id("cartFirstName");
    final private By lastNameField = By.id("cartLasttName");
    final private By phoneNumberField = By.id("cartMobile");
    final private By emailField = By.id("cartEmail");
    final private By countrySelect = By.id("cartCountry");
    final private By governmentSelect = By.id("cartGovernorate");
    final private By citySelect = By.id("cartCity");
    final private By districtSelect = By.id("cartDistrict");
    final private By streetField = By.id("Street");
    final private By squareField = By.id("mainStreetSquare");
    final private By landMarkField = By.id("landmark");
    final private By buildingField = By.id("building");
    final private By floorField = By.id("floor");
    final private By flatField = By.id("flat");
    final private By yesRadio = By.id("yes_direct");
    final private By noRadio = By.id("no_direct");
    final private By paymentMethodSelect = By.id("paymentMethod");
    final private By recurringSelect = By.id("recurring");
    final private By payButton = By.id("cartPayHome");
    final private By successfulMessage = By.xpath("//div[2]/h2");


    public CartPage(){
        PageFactory.initElements(HelperClass.getDriver(),this);
    }

    public void enterData(Map<String,String> myData){
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            System.out.println("--------------------");
            throw new RuntimeException(e);
        }
        selectByText(paymentMethodSelect,myData.get("paymentWay"));
        sendKeys(firstNameField,myData.get("firstName"));
        sendKeys(lastNameField,myData.get("lastName"));
        sendKeys(phoneNumberField,myData.get("phoneNumber"));
        sendKeys(emailField,myData.get("email"));

        selectByText(countrySelect,myData.get("country"));
        selectByText(governmentSelect,myData.get("government"));
        selectByText(citySelect,myData.get("city"));
        selectByText(districtSelect,myData.get("district"));

        sendKeys(streetField,myData.get("street"));
        sendKeys(squareField,myData.get("square"));
        sendKeys(landMarkField,myData.get("landMark"));
        sendKeys(buildingField,myData.get("building"));
        sendKeys(floorField,myData.get("floor"));
        sendKeys(flatField,myData.get("flat"));

        if(myData.get("toSpecificCity").equals("yes")){
            clickOn(yesRadio);
        } else {
            clickOn(noRadio);
        }
        selectByText(recurringSelect,myData.get("recurring"));
        clickOn(payButton);
    }

    public String getSuccessfulMessage(){
        return getText(successfulMessage);
    }
}