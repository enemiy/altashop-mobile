package test.automation.pages;


import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import test.automation.pageobject.BasePageObject;

public class HomePage extends BasePageObject {
    private By Beli_Btn() { return MobileBy.xpath("//hierarchy/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.ScrollView[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]");}
    private By Cart_icon() { return MobileBy.xpath("//android.widget.Button[@content-desc=\"1\"]");}

    @Step
    public void tapBeliButton() { onClick(Beli_Btn());}

    @Step
    public boolean itemInCart() { return waitUntilPresence(Cart_icon()).isDisplayed();}

    @Step
    public boolean isOnPage() { return waitUntilPresence(Beli_Btn()).isDisplayed();}
}
