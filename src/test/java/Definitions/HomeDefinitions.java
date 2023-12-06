package Definitions;

import Pages.HomePage;
import Utilies.HelperClass;

public class HomeDefinitions {
    private final HomePage homePage = new HomePage();
    private int numbersOfCartItems = 0;

    public void goToHomePage(){
        HelperClass.openPage("https://mekeg.org/");
    }

    public void enterTheDonationForGaza(String amount) {
        numbersOfCartItems = getNumbersOfCartItems();
        homePage.scrollingToCartSection();
        homePage.addDonationAmount(amount);
        homePage.addDonation();
        homePage.waitForCart();
    }

    private int getNumbersOfCartItems(){
        String number = homePage.getNumbersOfCartItems();
        if(number.isEmpty()){
            return 0;
        }
        else {
            return Integer.parseInt(number);
        }
    }

    public int getNumbersOfCartItemsBeforeDonation() {
        return numbersOfCartItems;
    }

    public int getNumbersOfCartItemsAfterDonation() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return getNumbersOfCartItems();
    }
}