package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {

    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user_avatar")
    public WebElement userAvatar;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement userLink;

    @FindBy(xpath = "//table[@id='tbl_users']/thead/tr/th")
    public List<WebElement> tableColumnNames;

    @FindBy(xpath = "//a[@role='button']/span")
    public WebElement accountHolderName;

}
