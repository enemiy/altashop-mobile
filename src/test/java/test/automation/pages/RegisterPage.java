package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import test.automation.pageobject.BasePageObject;


public class RegisterPage extends BasePageObject {
    private By LoginPage_Btn() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}
    private By RegisterPage_Btn() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[2]");}
    private  By Email_Field(){ return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[2]");}
    private  By FieldName(){ return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]");}
    private  By Password_Field(){ return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[3]");}
    private By Register_Btn() {return  MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}

    @Step
    public void onLoginPageButton() { onClick(LoginPage_Btn());}

    @Step
    public void onRegisterPageButton() { onClick(RegisterPage_Btn());}
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
    public void onNameField(String name) {
        onClick(FieldName());
        clear(FieldName());
        onType(FieldName(),name);}

    @Step
    public void onTapRegisterButton() { onClick(Register_Btn());}



}
