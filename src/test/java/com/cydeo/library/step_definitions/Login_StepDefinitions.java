package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.DashboardPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.username.sendKeys("librarian60@library");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.password.sendKeys("NyLIiSAm"+Keys.ENTER);
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
       Assert.assertTrue(dashboardPage.userAvatar.isDisplayed());
    }

    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.username.sendKeys("student60@library");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.password.sendKeys("QsPA9SHj"+Keys.ENTER);
    }

    @When("user enters librarian username {string}")
    public void user_enters_librarian_username(String username) {
        loginPage.username.sendKeys(username);
    }
    @When("user enters librarian password {string}")
    public void user_enters_librarian_password(String password) {
        loginPage.password.sendKeys(password+ Keys.ENTER);
    }

    @When("user enters student username {string}")
    public void user_enters_student_username(String username) {
        loginPage.username.sendKeys(username);
    }
    @When("user enters student password {string}")
    public void user_enters_student_password(String password) {
        loginPage.password.sendKeys(password+ Keys.ENTER);
    }

    @When("user enters librarian username {string} and password {string}")
    public void user_enters_librarian_username_and_password(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password+Keys.ENTER);
    }

    @Then("Table should have following columns")
    public void table_should_have_following_columns(List<String> expectedColumnNames) {
        dashboardPage.userLink.click();
        List<String> actualColumnNames = new ArrayList<>();
        for (WebElement tableColumnName : dashboardPage.tableColumnNames) {
            actualColumnNames.add(tableColumnName.getText());
        }
//        System.out.println("actualColumnNames = " + actualColumnNames);
//        System.out.println("expectedColumnNames = " + expectedColumnNames);
        Assert.assertTrue(actualColumnNames.equals(expectedColumnNames));
    }

    @When("user login using {string} and {string}")
    public void user_login_using_and(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password+Keys.ENTER);
    }
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String string) {
        BrowserUtils.waitForVisibility(dashboardPage.accountHolderName,10);
        Assert.assertTrue(dashboardPage.accountHolderName.getText().equals(string));
    }

}
