package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;
import test.automation.pageobject.BasePageObject;

public class AltaShopPage extends BasePageObject {
    private By LoginPage_Btn() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}

    private By Email_Field() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]");}

    private By Password_Field() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[2]");}

    private By Login_Btn() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}

    private By Logout_Btn() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}

    @Step
    public void onTapLoginPageButton() { onClick(LoginPage_Btn());}

    @Step
    public void onEmailField(String email) {
        onClick(Email_Field());
        clear(Email_Field());
        onType(Email_Field(),email);}

    @Step
    public void onPasswordField(String password) {
        onClick(Password_Field());
        clear(Password_Field());
        onType(Password_Field(),password);}

    @Step
    public void onTapLoginButton() { onClick(Login_Btn());}

    @Step
    public void verifyLogoutButton(){

        try {
            Object element =  waitUntilPresence(Logout_Btn());
           if (element.equals(null)){
               System.out.println("unsuccessful");
           }
           else{
               System.out.println("success");
           }
        } catch(Exception e) {

        }


    }

}