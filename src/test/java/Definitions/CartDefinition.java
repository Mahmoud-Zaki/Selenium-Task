package Definitions;

import Pages.CartPage;
import Utilies.HelperClass;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class CartDefinition {
    private final CartPage cartPage = new CartPage();
    private final String expectedSuccessfulMessage = " شكراً لدعمك مؤسسة مصر الخير ";

    public void goToCartPage(){
        HelperClass.openPage("https://mekeg.org/payment/personal-info?id=zu3e3t8ix9uxnti1n76ihr31p0z1o4wnximvm1eidib3p68nmslzlb4gou7u64yyewn4o8slkbt2boyi&type=sadaka&loc=EG");
    }
    
    public void enterDataWithTheFollowingDetails(DataTable dataTable){
        List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
        Map<String,String> myData = data.get(0);
        cartPage.enterData(myData);
    }
    public String getExpectedSuccessfulMessage(){ return expectedSuccessfulMessage;}

    public String getActualSuccessfulMessage(){
        return cartPage.getSuccessfulMessage();
    }
}