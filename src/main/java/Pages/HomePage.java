package Pages;

import Base.BaseClass;
import Utilies.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    final private By gazaDonationAmountField = By.xpath("//div[3]/div[3]/div/input");
    final private By gazaDonationButton = By.xpath("//button[@type = 'submit']");
    final private By cartIcon = By.id("cart-badge");
    final private By cartMenu = By.id("cart-menu");
    final private By donationSection = By.xpath("//section[@class = 'donation-section']");

    public HomePage(){
        PageFactory.initElements(HelperClass.getDriver(),this);
    }
    public void addDonationAmount(String amount){
        sendKeys(gazaDonationAmountField,amount);
    }

    public void addDonation(){
        clickOn(gazaDonationButton);

    }
    public String getNumbersOfCartItems(){
        return getText(cartIcon);
    }
    public void waitForCart(){
        waitToPresent(cartMenu);
    }

    public void scrollingToCartSection() {
        scrollTo(donationSection);
    }
}